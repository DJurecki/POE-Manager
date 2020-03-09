package com.jurecki.poemanager.bootstrap;

import com.jurecki.poemanager.domain.League;
import com.jurecki.poemanager.services.LeagueService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    LeagueService leagueService;

    public DataLoader(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @Override
    public void run(String... args) throws Exception {

      //  leagueService.getLeague("ssf+hardcore");

        List<League> leagues = leagueService.getAllLeagues();

        for(League league : leagues){
            System.out.println(league);
        }
    }
}
