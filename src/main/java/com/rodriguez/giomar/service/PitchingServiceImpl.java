package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Pitching;
import com.rodriguez.giomar.repository.PitchingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PitchingServiceImpl implements PitchingService {
    @Autowired
    private PitchingRepository pitchingRepository;

    @Override
    public List<Pitching> findAll(Integer page, Integer size) {
        return pitchingRepository.findAll(new PageRequest(page, size));
    }

    @Override
    public List<Pitching> findById(String playerId) {
        return pitchingRepository.findByPitchingIdPlayerID(playerId);
    }

    @Override
    public List<Pitching> findTop(Integer size, String colunm) {
        return pitchingRepository.findAll(new PageRequest(0, size, Sort.Direction.DESC, colunm));
    }
}
