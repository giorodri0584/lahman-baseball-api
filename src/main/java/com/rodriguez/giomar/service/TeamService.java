package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Team;

import java.util.List;

public interface TeamService {
    List<Team> findAll(Integer page, Integer size);
}
