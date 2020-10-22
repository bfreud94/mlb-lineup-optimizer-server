package com.freudware.mlblineupoptimizerserver.dao;

import java.util.List;

import com.freudware.mlblineupoptimizerserver.model.Batters;
import com.freudware.mlblineupoptimizerserver.model.Pitchers;

public interface PlayerDAO {

    public List<Batters> getBatters();
    
    public List<Pitchers> getPitchers();
    
}
