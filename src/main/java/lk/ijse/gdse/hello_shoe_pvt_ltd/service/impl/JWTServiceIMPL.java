package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.JWTService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JWTServiceIMPL implements JWTService {
    @Value("${token.key}")
    private String jwt;
    @Override
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    @Override
    public String generateToken(UserDetails userDetails) {
        return generateToken(new HashMap<>(), userDetails);
    }

    @Override
    public boolean validateToken(String token, UserDetails userDetails) {
        var username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    //actual process
    private<T> T extractClaim(String token, Function<Claims, T> claimResolver){
       final Claims claims = getAllClaims(token);

       return claimResolver.apply(claims);

    }

    private String generateToken(Map<String,Object> extractClaims, UserDetails userDetails){
        extractClaims.put("role", userDetails.getAuthorities());
        Date now = new Date();
        Date expireDate = new Date(now.getTime() + 1000 * 60*60*10);
        String accessToken = Jwts.builder().setClaims(extractClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(now)
                .setExpiration(expireDate)
                .signWith(getSignKey(), SignatureAlgorithm.HS256).compact() + " : " +
                Jwts.builder().setClaims(extractClaims)
                        .setSubject(userDetails.getUsername())
                        .setIssuedAt(now)
                        .setExpiration(new Date(now.getTime() + 1000 * 60 * 60))
                        .signWith(getSignKey(),SignatureAlgorithm.HS256).compact();



        return accessToken;

    }
    private boolean isTokenExpired(String token){
        return extractExpiration(token).before(new Date());
    }
    private Date extractExpiration(String token){
        return extractClaim(token, Claims::getExpiration);
    }
    private Claims getAllClaims(String token){
       return Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token).getBody();
    }

    private Key getSignKey(){
        byte[] decode = Decoders.BASE64.decode(jwt);
        return Keys.hmacShaKeyFor(decode);
    }
}
