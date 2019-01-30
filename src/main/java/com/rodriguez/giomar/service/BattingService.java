package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Batting;

import java.util.List;

public interface BattingService {
    List<Batting> findAll(Integer page, Integer size);
    List<Batting> findAll(String playerId, Integer page, Integer size);
    List<Batting> findTop(Integer size, String column);
    List<Batting> search(String[] query, Integer page, Integer size);
}
