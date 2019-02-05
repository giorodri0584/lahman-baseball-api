package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Fielding;
import com.rodriguez.giomar.repository.FieldingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class FieldingServiceImpl implements FieldingService {
    @Autowired
    private FieldingRepository fieldingRepository;

    @Override
    public Page<Fielding> findAll(Integer page, Integer size) {
        return fieldingRepository.findAll(new PageRequest(page, size));
    }

    @Override
    public Page<Fielding> findByPlayerId(String playerId, Integer page, Integer size) {
        return fieldingRepository.findByCompositeIdPlayerID(playerId, new PageRequest(page, size));
    }
}
