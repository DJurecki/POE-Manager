package com.jurecki.poemanager.services;

import com.jurecki.poemanager.domain.League;
import com.jurecki.poemanager.repositories.LeagueRepository;
import org.springframework.stereotype.Service;

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
    public void delete(League league) {
        leagueRepository.delete(league);
    }
}
