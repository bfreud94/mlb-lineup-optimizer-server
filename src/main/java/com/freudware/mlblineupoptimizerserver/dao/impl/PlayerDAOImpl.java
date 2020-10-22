package com.freudware.mlblineupoptimizerserver.dao.impl;

import java.util.List;

import com.freudware.mlblineupoptimizerserver.dao.PlayerDAO;
import com.freudware.mlblineupoptimizerserver.model.Batters;
import com.freudware.mlblineupoptimizerserver.model.Pitchers;
import com.freudware.mlblineupoptimizerserver.repository.BatterRepository;
import com.freudware.mlblineupoptimizerserver.repository.PitcherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerDAOImpl implements PlayerDAO {

    @Autowired
    private BatterRepository batterRepository;

    @Autowired
    private PitcherRepository pitcherRepository;

    public List<Batters> getBatters() {
        List<Batters> batters = batterRepository.findAll();
        return batters;
    }

    public List<Pitchers> getPitchers() {
        List<Pitchers> pitchers = pitcherRepository.findAll();
        return pitchers;
    }
}
