package com.example.faq;

import com.example.news.news;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class faqController {

    @Autowired
    private faqRepository faqRepository;

    @GetMapping(value = "/faq")
    public ResponseEntity<List<faq>> getAllFaq() {
        try {
            return new ResponseEntity<List<faq>>(faqRepository.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<List<faq>>(HttpStatus.OK);
        }

    }

}
