package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.reqAndresp.authObj.AuthenticationService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.reqAndresp.response.JwtAuthResponse;
import lk.ijse.gdse.hello_shoe_pvt_ltd.reqAndresp.secure.SignIn;
import lk.ijse.gdse.hello_shoe_pvt_ltd.reqAndresp.secure.SignUp;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class User {
    private final UserService userService;
    private final AuthenticationService authenticationService;

    //Sign up
    @PostMapping("/signup")
    public ResponseEntity<JwtAuthResponse> signUp(@RequestBody SignUp signUp){
        return ResponseEntity.ok(authenticationService.signUp(signUp));

    }

    //Sign in
    @PostMapping("/signin")
    public ResponseEntity<JwtAuthResponse> signIn(@RequestBody SignIn signIn){
        return ResponseEntity.ok(authenticationService.signIn(signIn));
    }


}
