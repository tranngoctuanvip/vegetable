package com.thuanthanh.vegetables.security.jwt;

import com.thuanthanh.vegetables.security.userprincal.UserPrinciple;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtProvider {
    private static final Logger logger = LoggerFactory.getLogger(JwtProvider.class);
    private String jwtSecret = "tuanngoctran1807@gmail.com";
    private int jwtExpiration = 86400;
    //Tạo token
    public String creaToken(Authentication authentication){
        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();
        return Jwts.builder().setSubject(userPrinciple.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() +jwtExpiration))
                .signWith(SignatureAlgorithm.HS512,jwtSecret)
                .compact();
    }
    //check Token hợp lệ hay không
    public Boolean validateToken(String token){
        try{
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
            return true;
        } catch (SignatureException e) {
            logger.error("Invalid signature -> Message: {}",e);
        } catch (MalformedJwtException e){
            logger.error("Invalid format token -> Message: {}",e);
        }catch (ExpiredJwtException e){
            logger.error("Expired JWT token -> Message: {}",e);
        }catch (UnsupportedJwtException e){
            logger.error("Unsupported JWT token -> Message: {}",e);
        }catch (IllegalArgumentException e){
            logger.error("JWT claims string is empty -> Message: {}",e);
        }
        return false;
    }
    //Tim tên từ Token
    public String getUsernameFromToken(String token){
        String username = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
        return username;
    }
}
