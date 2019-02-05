package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Pitching;
import org.springframework.data.domain.Page;

public interface PitchingService {
    Page<Pitching> findAll(Integer page, Integer size);
    Page<Pitching> findById(String playerId, Integer page, Integer size);
    Page<Pitching> findTop(Integer size, String colunm);
}
