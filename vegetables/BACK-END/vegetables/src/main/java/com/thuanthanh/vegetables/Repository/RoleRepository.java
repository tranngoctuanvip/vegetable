package com.thuanthanh.vegetables.Repository;

import com.thuanthanh.vegetables.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    String findByName(String name);
}
