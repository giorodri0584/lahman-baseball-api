package com.rodriguez.giomar.service;

import com.rodriguez.giomar.errors.SearchError;
import com.rodriguez.giomar.model.Player;
import com.rodriguez.giomar.repository.PlayerRepository;
import com.rodriguez.giomar.repository.SpecificationsBuilder;
import fj.data.Either;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    @Override
    public Page<Player> findAll(Integer page, Integer size) {
        return playerRepository.findAll(new PageRequest(page, size));
    }

    @Override
    public Page<Player> findOne(String playerId, Integer page, Integer size) {
        return playerRepository.findByPlayerID(playerId, new PageRequest(page, size));
    }

    @Override
    public Either<SearchError, Page<Player>> search(String[] query, Integer page, Integer size) {
        return Either.right(playerRepository.findAll(SpecificationsBuilder.build(query), new PageRequest(0,20)));
    }
}
