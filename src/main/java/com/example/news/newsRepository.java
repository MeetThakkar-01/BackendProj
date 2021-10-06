package com.example.news;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface newsRepository extends MongoRepository<news, String> {
    @Override
    List<news> findAll();
}
