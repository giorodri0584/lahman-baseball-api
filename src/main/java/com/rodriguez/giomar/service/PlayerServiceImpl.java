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
    public Player findOne(String playerId) {
        return playerRepository.findByPlayerID(playerId);
    }

    @Override
    public Either<SearchError, Page<Player>> search(String[] query, Integer page, Integer size) {
        try {
            Page players = playerRepository.findAll(SpecificationsBuilder.build(query), new PageRequest(0,20));
            return Either.right(players);
        }catch (Exception e){
            return Either.left(new SearchError(e.getMessage().toString()));
        }
    }
}
