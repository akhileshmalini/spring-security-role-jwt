package com.akhianand.springrolejwt.service;

import com.akhianand.springrolejwt.model.User;
import com.akhianand.springrolejwt.model.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
