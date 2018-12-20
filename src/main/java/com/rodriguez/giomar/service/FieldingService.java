package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Fielding;

import java.util.List;

public interface FieldingService {
    List<Fielding> findAll(Integer page, Integer size);
    List<Fielding> findByPlayerId(String playerId);
}
