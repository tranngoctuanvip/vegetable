package com.thuanthanh.vegetables.Service;

import com.thuanthanh.vegetables.Entity.Role;

public interface RoleService {
    String findByName(Role role);
    Role findById(Role rId);
}
