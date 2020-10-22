package com.freudware.mlblineupoptimizerserver.repository;

import com.freudware.mlblineupoptimizerserver.model.Teams;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Teams, String> {
    
}
