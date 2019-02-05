package com.rodriguez.giomar.service;

import com.rodriguez.giomar.errors.SearchError;
import com.rodriguez.giomar.model.Batting;
import fj.data.Either;
import org.springframework.data.domain.Page;

public interface BattingService {
    Page<Batting> findAll(Integer page, Integer size);
    Page<Batting> findAll(String playerId, Integer page, Integer size);
    Page<Batting> findTop(Integer size, String column);
    Either<SearchError, Page<Batting>> search(String[] query, Integer page, Integer size);
}
