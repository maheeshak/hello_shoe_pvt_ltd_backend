package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.UserRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.UserDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.UserEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.reqAndresp.authObj.AuthenticationService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.reqAndresp.response.JwtAuthResponse;
import lk.ijse.gdse.hello_shoe_pvt_ltd.reqAndresp.secure.SignIn;
import lk.ijse.gdse.hello_shoe_pvt_ltd.reqAndresp.secure.SignUp;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.JWTService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Role;
import lombok.RequiredArgsConstructor;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceIMPL implements AuthenticationService {
    private final UserRepo userRepo;
    private final JWTService jwtService;
    private final Mapping mapping;

    //utils
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;



    @Override
    public JwtAuthResponse signIn(SignIn signIn) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signIn.getEmail(), signIn.getPassword()));
                var email =userRepo.findByEmail(signIn.getEmail())
                        .orElseThrow(() -> new UsernameNotFoundException("User not found")
                );
                var generateToken = jwtService.generateToken(email);
                return JwtAuthResponse.builder()
                        .token(generateToken)
                        .build();






    }


    @Override
    public JwtAuthResponse signUp(SignUp signIn) {
        UserDTO buildUser = UserDTO.builder()
                .id(UUID.randomUUID().toString())
                .email(signIn.getEmail())
                .password(passwordEncoder.encode(signIn.getPassword()))
                .role(Role.valueOf(signIn.getRole()))
                .build();
        var savedUser = userRepo.save(mapping.toUserEntity(buildUser));
        var genToken =  jwtService.generateToken(savedUser);
        return JwtAuthResponse.builder().token(genToken).build();
    }

    @Override
    public String refreshToken(String token) {
        String userName = jwtService.extractUsername(token);
        UserEntity user = userRepo.findByEmail(userName)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        jwtService.generateToken(user);
        return JwtAuthResponse.builder().token(jwtService.generateToken(user)).build().getToken();
    }
}
