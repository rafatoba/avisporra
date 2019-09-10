package org.avisporra.web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avisporra.entity.Team;
import com.avisporra.repository.TeamRepository;

@RestController
public class TeamController {
    
    private final TeamRepository teamRepository;
    
    public TeamController(final TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
    
    @RequestMapping("/teams")
    public List<Team> getTeams() {
        return teamRepository.findAll();   
    }

}
