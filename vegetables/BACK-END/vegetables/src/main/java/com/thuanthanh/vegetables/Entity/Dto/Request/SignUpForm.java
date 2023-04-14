package com.thuanthanh.vegetables.Entity.Dto.Request;

import com.thuanthanh.vegetables.Entity.Role;
import lombok.Data;

@Data
public class SignUpForm {
    private String name;
    private String username;
    private String password;
    private String sdt;
    private String email;
    private String address;
    private Role roles;
}
