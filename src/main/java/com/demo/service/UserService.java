package com.demo.service;

import com.demo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> findAll();
    String findUser(User user);
    User findUserByName(String name);
}
