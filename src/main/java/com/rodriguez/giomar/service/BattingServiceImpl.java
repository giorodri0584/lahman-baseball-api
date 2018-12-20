package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Batting;
import com.rodriguez.giomar.repository.BattingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BattingServiceImpl implements BattingService{
    @Autowired
    private BattingRepository battingRepository;
    @Override
    public List<Batting> findAll(String playerId, Integer page, Integer size) {
        return battingRepository.findByBattingIdPlayerID(playerId, new PageRequest(page, size));
    }

    @Override
    public List<Batting> findTop(Integer size, String colunm) {
        return battingRepository.findAll(new PageRequest(0, size, Sort.Direction.DESC, colunm));
    }
}
