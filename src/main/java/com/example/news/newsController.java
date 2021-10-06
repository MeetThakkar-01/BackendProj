package com.example.news;

import com.example.revenue.revenue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class newsController {

    @Autowired
    private newsService newsService;

    @GetMapping(value = "/news")
    public ResponseEntity<List<news>> getAllNews() {
        try {
            return new ResponseEntity<List<news>>(newsService.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<List<news>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
