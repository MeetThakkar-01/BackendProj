package com.example.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class revenueController {

    @Autowired
    private revenueService revenueService;


    @GetMapping(value = "/revenue")
    public List<revenue> getAllRevenue() {
        return revenueService.findAll();
    }

}
