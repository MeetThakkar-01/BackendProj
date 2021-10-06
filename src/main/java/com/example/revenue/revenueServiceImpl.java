package com.example.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class revenueServiceImpl implements revenueService{

    @Autowired
    private revenueRepository revenueRepository;

    @Override
    public List<revenue> findAll() {
        return revenueRepository.findAll();
    }
}
