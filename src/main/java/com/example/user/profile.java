package com.example.user;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


public class profile {
    List<Integer> profileList;

    public profile(List<Integer> list) {
        this.profileList = list;
    }

    public List<Integer> getList() {
        return profileList;
    }

    public void setList(List<Integer> list) {
        this.profileList = list;
    }
}
