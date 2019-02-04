package com.rodriguez.giomar.service;

import com.rodriguez.giomar.errors.SearchError;
import com.rodriguez.giomar.model.Batting;
import fj.data.Either;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BattingService {
    List<Batting> findAll(Integer page, Integer size);
    List<Batting> findAll(String playerId, Integer page, Integer size);
    List<Batting> findTop(Integer size, String column);
    Either<SearchError, Page<Batting>> search(String[] query, Integer page, Integer size);
}
