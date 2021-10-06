package com.example.revenue;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface revenueRepository extends MongoRepository<revenue, String> {

    @Override
    List<revenue> findAll();
}
