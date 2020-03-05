package com.jurecki.poemanager.repositories;

import com.jurecki.poemanager.domain.League;
import org.springframework.data.repository.CrudRepository;

public interface LeagueRepository extends CrudRepository<League, String> {
}
