package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class userController {

    @Autowired
    private userRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<user>> getAllUsers() {
        try {
            return new ResponseEntity<List<user>>(userRepository.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<List<user>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/login")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> userLogin(@RequestBody user u) {
        user u1 = userRepository.findByEmail(u.getEmail());
        if (u1 != null) {
            return new ResponseEntity<user>(u1, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<String>("User Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/register")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> userRegister(@RequestBody user u) {
        if (userRepository.findByEmail(u.getEmail()) != null) {
            return new ResponseEntity<String>("User Already Found", HttpStatus.FOUND);
        }
        else {
            userRepository.save(u);
            return new ResponseEntity<user>(u, HttpStatus.OK);
        }
    }
}
