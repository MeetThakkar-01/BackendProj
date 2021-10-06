package com.example.user;

public interface userService {
    user registerUser(user u);
    user loginUser(String username, String password);
}
