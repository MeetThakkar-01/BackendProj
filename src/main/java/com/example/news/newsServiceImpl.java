package com.example.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class newsServiceImpl implements  newsService{

    @Autowired
    private newsRepository newsRepository;

    @Override
    public List<news> findAll() {
        return newsRepository.findAll();
    }
}
