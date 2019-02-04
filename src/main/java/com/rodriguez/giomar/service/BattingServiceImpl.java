package com.rodriguez.giomar.service;

import com.rodriguez.giomar.errors.SearchError;
import com.rodriguez.giomar.model.Batting;
import com.rodriguez.giomar.repository.BattingRepository;
import com.rodriguez.giomar.repository.SpecificationsBuilder;
import fj.data.Either;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.StringTokenizer;

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
    public Either<SearchError, Page<Batting>> search(String[] query, Integer page, Integer size) {
        for(int i = 0; i < query.length; i++){
            query[i] = query[i].toUpperCase();
            StringTokenizer queryToken = new StringTokenizer(query[i], "=:<>", true);
            String key = queryToken.nextToken();
            if(key.equals("2B")){
                query[i] = query[i].replace("2B", "doubles");
            }
            if (key.equals("3B")){
                query[i] = query[i].replace("3B", "triples");
            }
        }
        return Either.right(battingRepository.findAll(SpecificationsBuilder.build(query), new PageRequest(page, size)));
    }
}
