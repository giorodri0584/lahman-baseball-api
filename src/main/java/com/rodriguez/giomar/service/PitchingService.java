package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Pitching;

import java.util.List;

public interface PitchingService {
    List<Pitching> findAll(Integer page, Integer size);
    List<Pitching> findById(String playerId);
    List<Pitching> findTop(Integer size, String colunm);
}
