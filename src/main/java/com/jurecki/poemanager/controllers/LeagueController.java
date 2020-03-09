package com.jurecki.poemanager.controllers;

import com.jurecki.poemanager.domain.League;
import com.jurecki.poemanager.services.LeagueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeagueController {

    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @GetMapping("/{leagueName}")
    public League getLeague(@PathVariable String leagueName) {
        return leagueService.getLeague(leagueName);
    }

    @GetMapping("/leagues")
    public List<League> getAllLeagues(){
        return leagueService.getAllLeagues();
    }
}
