package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.User;
import com.thuanthanh.vegetables.Repository.UserRepository;
import com.thuanthanh.vegetables.Service.UserSevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service("UserSevice")
public class UserServiceImpl implements UserSevice {
    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;
    @Override
    public Optional<User> findByUserName(String username) {
        try {
            return userRepository.findByUserName(username);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
    @Override
    public Boolean existsByUserName(String username) {
        try {
            return userRepository.existsByUserName(username);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
    @Override
    public Boolean existsByEmail(String email) {
        try {
            return userRepository.existsByEmail(email);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public User save(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
