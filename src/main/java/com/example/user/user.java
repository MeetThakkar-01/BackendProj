package com.example.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Document(collection = "user")
public class user {
    @Id
    private String id;

    private String email;
    private String password;
    List<Integer> profile ;

    public user(String email, String password, List<Integer> profile) {
        this.email = email;
        this.password = password;
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getProfile() {
        return profile;
    }

    public void setProfile(List<Integer> profile) {
        this.profile = profile;
    }
}
