package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Pitching;
import com.rodriguez.giomar.repository.PitchingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PitchingServiceImpl implements PitchingService {
    @Autowired
    private PitchingRepository pitchingRepository;

    @Override
    public Page<Pitching> findAll(Integer page, Integer size) {
        return pitchingRepository.findAll(new PageRequest(page, size));
    }

    @Override
    public Page<Pitching> findById(String playerId, Integer page, Integer size) {
        return pitchingRepository.findByPitchingIdPlayerID(playerId, new PageRequest(page, size));
    }

    @Override
    public Page<Pitching> findTop(Integer size, String colunm) {
        return pitchingRepository.findAll(new PageRequest(0, size, Sort.Direction.DESC, colunm));
    }
}
