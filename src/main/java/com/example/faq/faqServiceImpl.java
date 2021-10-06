package com.example.faq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class faqServiceImpl implements faqService{

    @Autowired
    private faqRepository faqRepository;

    @Override
    public List<faq> findAll() {
        return faqRepository.findAll();
    }
}
