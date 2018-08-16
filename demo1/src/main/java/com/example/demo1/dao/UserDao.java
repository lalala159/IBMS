package com.example.demo1.dao;

import com.example.demo1.entity.User;

public interface UserDao {
    User findByUsername(String username);
}