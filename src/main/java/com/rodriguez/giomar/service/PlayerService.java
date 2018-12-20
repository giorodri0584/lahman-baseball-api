package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Player;

import java.util.List;

public interface PlayerService {
    List<Player> findAll(Integer page, Integer size);
    Player findOne(String playerId);
    List<Player> search(String search, Integer page, Integer size);
}
