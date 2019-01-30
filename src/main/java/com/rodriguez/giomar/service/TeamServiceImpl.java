package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Team;
import com.rodriguez.giomar.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<Team> findAll(Integer page, Integer size) {
        return teamRepository.findAll(new PageRequest(page, size));
    }

    @Override
    public List<Team> findByTeamId(String teamId) {
        return teamRepository.findByTeamID(teamId);
    }
}
