package com.jurecki.poemanager.services;

import com.jurecki.poemanager.domain.League;

import java.util.List;
import java.util.Optional;

public interface LeagueService {

    List<League> findAll();

    Optional<League> findById(String id);

    League save(League newLeague);

    List<League> saveAll(List<League> leagueList);

    void delete(League league);

    League getLeague(String leagueName);

   // List<League> getAllLeagues();
}
