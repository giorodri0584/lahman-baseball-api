package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Player;
import com.rodriguez.giomar.repository.PlayerRepository;
import com.rodriguez.giomar.repository.SpecificationsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    @Override
    public List<Player> findAll(Integer page, Integer size) {
        return playerRepository.findAll(new PageRequest(page, size));
    }

    @Override
    public Player findOne(String playerId) {
        return playerRepository.findOne(playerId);
    }

    @Override
    public List<Player> search(String search, Integer page, Integer size) {
        SpecificationsBuilder<Player> builder = new SpecificationsBuilder<Player>();
        Pattern pattern = Pattern.compile("(\\w+?)(:|<|>|@)(\\w+?),");
        Matcher matcher = pattern.matcher(search + ",");
        while (matcher.find()) {
            builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
        }
        Specification spec = builder.build();
        return playerRepository.findAll(spec, new PageRequest(page,size)).getContent();
    }
}
