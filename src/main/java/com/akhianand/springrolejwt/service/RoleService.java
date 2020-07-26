package com.akhianand.springrolejwt.service;

import com.akhianand.springrolejwt.model.Role;

public interface RoleService {
    Role findByName(String name);
}
