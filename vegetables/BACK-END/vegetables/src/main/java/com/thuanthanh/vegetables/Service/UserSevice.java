package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.User;

import java.util.Optional;

public interface UserSevice {
    Optional<User> findByUserName(String username);
    Boolean existsByUserName(String username);
    Boolean existsByEmail(String email);
    User save (User user);
}
