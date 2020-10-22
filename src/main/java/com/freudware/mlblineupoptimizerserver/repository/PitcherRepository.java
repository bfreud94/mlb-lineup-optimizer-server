package com.freudware.mlblineupoptimizerserver.repository;

import com.freudware.mlblineupoptimizerserver.model.Pitchers;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PitcherRepository extends MongoRepository<Pitchers, String> {
    
}
