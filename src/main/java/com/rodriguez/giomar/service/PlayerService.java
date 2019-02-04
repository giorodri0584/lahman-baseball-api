package com.rodriguez.giomar.service;

import com.rodriguez.giomar.errors.SearchError;
import com.rodriguez.giomar.model.Player;
import fj.data.Either;
import org.springframework.data.domain.Page;

public interface PlayerService {
    Page<Player> findAll(Integer page, Integer size);
    Player findOne(String playerId);
    Either<SearchError, Page<Player>> search(String[] query, Integer page, Integer size);
}
