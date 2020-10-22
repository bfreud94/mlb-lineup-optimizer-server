package com.freudware.mlblineupoptimizerserver.controllers;

import java.util.List;

import com.freudware.mlblineupoptimizerserver.dao.PlayerDAO;
import com.freudware.mlblineupoptimizerserver.model.Batters;
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
public class BatterController {

    @Autowired
    private PlayerDAO playerDAO;

    @Autowired
    private Gson gson;

    @RequestMapping(value="/batters", method=RequestMethod.GET)
	public ResponseEntity<String> getBatters()	{
        List<Batters> batters = playerDAO.getBatters();
        System.out.println("Getting batters");
        return ResponseEntity.status(HttpStatus.OK).body(gson.toJson(batters));
    }
}
