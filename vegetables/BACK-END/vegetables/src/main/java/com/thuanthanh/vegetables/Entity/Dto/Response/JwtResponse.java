package com.thuanthanh.vegetables.Entity.Dto.Response;

import com.thuanthanh.vegetables.Entity.Role;
import com.thuanthanh.vegetables.Entity.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtResponse {
    private String token;
    private String type ="Bearer";

    private User user;

    public JwtResponse() {
    }

    public JwtResponse(String token, String type, User user) {
        this.token = token;
        this.type = type;
        this.user = user;
    }

    public JwtResponse(String token, User user) {
        this.token = token;
        this.user=user;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
