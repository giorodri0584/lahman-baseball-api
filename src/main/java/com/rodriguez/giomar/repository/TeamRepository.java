package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.Team;
import com.rodriguez.giomar.model.TeamCompositeId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends CrudRepository<Team, TeamCompositeId> {
    List<Team> findAll(Pageable pageable);
    List<Team> findByTeamID(String teamID);
}
