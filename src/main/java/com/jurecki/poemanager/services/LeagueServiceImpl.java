package com.jurecki.poemanager.services;

import com.jurecki.poemanager.domain.League;
import com.jurecki.poemanager.repositories.LeagueRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LeagueServiceImpl implements LeagueService {

    private final LeagueRepository leagueRepository;

    public LeagueServiceImpl(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    @Override
    public List<League> findAll() {
        List<League> leagues = new ArrayList<>();
        leagueRepository.findAll().forEach(leagues::add);
        return leagues;
    }

    @Override
    public Optional<League> findById(String id) {
        return leagueRepository.findById(id);
    }

    @Override
    public League save(League newLeague) {
        return leagueRepository.save(newLeague);
    }

    @Override
    public List<League> saveAll(List<League> leagueList) {
        return (List<League>) leagueRepository.saveAll(leagueList);
    }

    @Override
    public void delete(League league) {
        leagueRepository.delete(league);
    }

    @Override
    public League getLeague(String leagueName) {
        final League responseBody = new RestTemplate().getForObject("http://api.pathofexile.com/leagues/" + leagueName,
                League.class);
        League savedLeague = this.save(responseBody);
        System.out.println(savedLeague);
        return responseBody;
    }

    /*@Override
    public List<League> getAllLeagues() {
        final List<League> responseBody = new RestTemplate().getForObject("http://api.pathofexile.com/leagues?realm=pc",
                League.class);
        List<League> leagueList = this.saveAll(responseBody);
        for(League league : leagueList){
            System.out.println(league);
        }
        return responseBody;
    }*/
}
