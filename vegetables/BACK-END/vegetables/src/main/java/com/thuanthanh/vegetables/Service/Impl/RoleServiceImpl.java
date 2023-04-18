package com.thuanthanh.vegetables.Service.Impl;

import com.thuanthanh.vegetables.Entity.Role;
import com.thuanthanh.vegetables.Repository.RoleRepository;
import com.thuanthanh.vegetables.Service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RoleService")
public class RoleServiceImpl implements RoleService {
    public static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public String findByName(Role role) {
        try{
            return roleRepository.findByName(role.getName());
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Role findById(Role rId) {
        try {
            return roleRepository.findById(rId.getId()).get();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
