package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Fielding;
import org.springframework.data.domain.Page;

public interface FieldingService {
    Page<Fielding> findAll(Integer page, Integer size);
    Page<Fielding> findByPlayerId(String playerId, Integer page, Integer size);
}
