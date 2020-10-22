package com.freudware.mlblineupoptimizerserver.repository;

import com.freudware.mlblineupoptimizerserver.model.Batters;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatterRepository extends MongoRepository<Batters, String> {
    
}
