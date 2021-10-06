package com.example.faq;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface faqRepository extends MongoRepository<faq, String> {

    @Override
    List<faq> findAll();
}
