package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Player;
import com.rodriguez.giomar.repository.PlayerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)

public class PlayerServiceImplIntegrationTest {

    @TestConfiguration
    static class PlayerServiceImplContextConfiguration{
        @Bean
        public PlayerService playerService(){
            return new PlayerServiceImpl();
        }
    }

    @Autowired
    PlayerService playerService;
    @MockBean
    PlayerRepository playerRepository;

    @Before
    public void setUp(){
        Player found = playerRepository.findOne("abercda01");
        Mockito.when(playerRepository.findOne(found.getPlayerID())).thenReturn(found);
    }

    @Test
    public void findOne() {
        String playerId= "abercda01";
        Player found = playerService.findOne("abercda01");

        assertThat(playerId).isEqualTo(found.getPlayerID());
    }
}