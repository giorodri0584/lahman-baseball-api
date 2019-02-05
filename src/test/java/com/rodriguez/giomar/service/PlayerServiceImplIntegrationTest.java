package com.rodriguez.giomar.service;

import com.rodriguez.giomar.model.Player;
import com.rodriguez.giomar.repository.PlayerRepository;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PlayerServiceImplIntegrationTest {

    @Autowired
    PlayerService playerService;
    @MockBean
    PlayerRepository playerRepository;

    @Before
    public void setUp(){
        Player found = playerRepository.findOne("abercda01");
        Mockito.when(playerRepository.findOne(found.getPlayerID())).thenReturn(found);
    }

//    @Test
//    public void findOne() {
//        String playerId= "abercda01";
//        Player found = playerService.findOne("abercda01");
//
//        assertThat(playerId).isEqualTo(found.getPlayerID());
//    }
}