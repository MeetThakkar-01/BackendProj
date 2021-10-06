package com.example.news;

import com.example.revenue.revenue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class newsController {

    @Autowired
    private newsService newsService;

    @GetMapping(value = "/news")
    public List<news> getAllNews() {
        return newsService.findAll();
    }
}
