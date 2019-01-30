package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Batting;
import com.rodriguez.giomar.repository.BattingRepository;
import com.rodriguez.giomar.repository.SpecificationsBuilder;
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
    public List<Batting> findAll(Integer page, Integer size) {
        return battingRepository.findAll(new PageRequest(page, size));
    }

    @Override
    public List<Batting> findAll(String playerId, Integer page, Integer size) {
        return battingRepository.findByBattingIdPlayerID(playerId, new PageRequest(page, size));
    }

    @Override
    public List<Batting> findTop(Integer size, String colunm) {
        return battingRepository.findAll(new PageRequest(0, size, Sort.Direction.DESC, colunm));
    }

    @Override
    public List<Batting> search(String[] query, Integer page, Integer size) {
        for(int i = 0; i < query.length; i++){
            System.out.println(query[i]);
            if(query[i].equals("2b") || query[i].equals("2B")){
                System.out.println(query[i]);
                query[i] = "doubles";
                System.out.println(query[i]);
            }
            if (query[i].equals("3b") || query[i].equals("3B")){
                query[i] = "triples";
            }

            query[i] = query[i].toUpperCase();
        }
        return battingRepository.findAll(SpecificationsBuilder.build(query), new PageRequest(page, size)).getContent();
    }
}
