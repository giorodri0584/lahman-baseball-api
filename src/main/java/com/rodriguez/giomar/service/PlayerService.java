package com.rodriguez.giomar.service;

import com.rodriguez.giomar.errors.SearchError;
import com.rodriguez.giomar.model.Player;
import fj.data.Either;
import org.springframework.data.domain.Page;

public interface PlayerService {
    Page<Player> findAll(Integer page, Integer size);
    Page<Player> findOne(String playerId, Integer page, Integer size);
    Either<SearchError, Page<Player>> search(String[] query, Integer page, Integer size);
}
