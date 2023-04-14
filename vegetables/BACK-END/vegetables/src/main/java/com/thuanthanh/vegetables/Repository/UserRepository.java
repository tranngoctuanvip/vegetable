package com.thuanthanh.vegetables.Repository;

import com.thuanthanh.vegetables.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserName(String username); // Tìm kiếm user có tồn tại trong DB không
    Boolean existsByUserName(String username); // user đã có trong DB chưa
    Boolean existsByEmail(String email); // email đã có trong DB chưa
}
