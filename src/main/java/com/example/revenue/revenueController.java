package com.example.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class revenueController {

    @Autowired
    private revenueService revenueService;


    @GetMapping(value = "/revenue")
    public ResponseEntity<List<revenue>> getAllRevenue() {

        try {
            return new ResponseEntity<List<revenue>>(revenueService.findAll(),HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<List<revenue>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
