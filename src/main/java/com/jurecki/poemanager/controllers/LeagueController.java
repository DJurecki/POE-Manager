package com.jurecki.poemanager.controllers;

import com.jurecki.poemanager.domain.League;
import com.jurecki.poemanager.services.LeagueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LeagueController {

 /*   RestTemplate restTemplate;

    public LeagueController() {
        restTemplate = new RestTemplate();
    }*/

    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @GetMapping("/{leagueName}")
    public League getLeague(@PathVariable String leagueName) {
        final League responseBody = new RestTemplate().getForObject("http://api.pathofexile.com/leagues/" + leagueName,
                League.class);
        League savedLeague = leagueService.save(responseBody);
        System.out.println(savedLeague);
   /*     List<League> leagues = leagueService.findAll();
        for(League league : leagues){
            System.out.println(league);
        }*/
        return responseBody;
    }


}
