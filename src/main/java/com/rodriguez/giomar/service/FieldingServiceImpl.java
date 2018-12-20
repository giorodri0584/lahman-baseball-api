package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Fielding;
import com.rodriguez.giomar.repository.FieldingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldingServiceImpl implements FieldingService {
    @Autowired
    private FieldingRepository fieldingRepository;

    @Override
    public List<Fielding> findAll(Integer page, Integer size) {
        return fieldingRepository.findAll(new PageRequest(page, size));
    }

    @Override
    public List<Fielding> findByPlayerId(String playerId) {
        return fieldingRepository.findByCompositeIdPlayerID(playerId);
    }
}
