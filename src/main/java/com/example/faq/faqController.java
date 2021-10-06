package com.example.faq;

import com.example.news.news;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class faqController {

    @Autowired
    private faqRepository faqRepository;

    @GetMapping(value = "/faq")
    public List<faq> getAllFaq() {
        return faqRepository.findAll();
    }

}
