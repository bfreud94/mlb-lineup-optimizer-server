package com.freudware.mlblineupoptimizerserver.dao.impl;

import java.util.List;

import com.freudware.mlblineupoptimizerserver.dao.TeamDAO;
import com.freudware.mlblineupoptimizerserver.model.Teams;
import com.freudware.mlblineupoptimizerserver.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamDAOImpl implements TeamDAO {

    @Autowired
    private TeamRepository teamRepository;

    public List<Teams> getTeams() {
        List<Teams> teams = teamRepository.findAll();
        return teams;
    }
    
}
