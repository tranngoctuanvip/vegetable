package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.User;
import com.thuanthanh.vegetables.Repository.UserRepository;
import com.thuanthanh.vegetables.Service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service("UserSevice")
public class UserServiceImpl implements UserSevice {
    @Autowired
    private UserRepository userRepository;
    @Override
    public Optional<User> findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public Boolean existsByUserName(String username) {
        return userRepository.existsByUserName(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
