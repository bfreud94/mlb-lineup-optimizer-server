package com.freudware.mlblineupoptimizerserver.controllers;

import java.util.List;

import com.freudware.mlblineupoptimizerserver.dao.TeamDAO;
import com.freudware.mlblineupoptimizerserver.model.Teams;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class TeamController {

    @Autowired
    private TeamDAO teamDAO;

    @Autowired
    private Gson gson;

	@RequestMapping(value="/teams", method=RequestMethod.GET)
	public ResponseEntity<String> getTeams()	{
        List<Teams> teams = teamDAO.getTeams();
        System.out.println("Getting teams");
        return ResponseEntity.status(HttpStatus.OK).body(gson.toJson(teams));
	}
}
