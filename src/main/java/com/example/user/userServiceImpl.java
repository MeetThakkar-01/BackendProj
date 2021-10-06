package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;

public class userServiceImpl implements  userService{

    @Autowired
    private userRepository userRepository;

    @Override
    public user registerUser(user u) {
        return null;
    }

    @Override
    public user loginUser(String username, String password) {
        return null;
    }
}
