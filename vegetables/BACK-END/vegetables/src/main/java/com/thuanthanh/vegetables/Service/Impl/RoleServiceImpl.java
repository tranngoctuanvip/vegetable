package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.Role;
import com.thuanthanh.vegetables.Repository.RoleRepository;
import com.thuanthanh.vegetables.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RoleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public String findByName(Role role) {
        return roleRepository.findByName(role.getName());
    }

    @Override
    public Role findById(Role rId) {
        return roleRepository.findById(rId.getId()).get();
    }
}
