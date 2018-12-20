package com.rodriguez.giomar;

import com.rodriguez.giomar.model.Player;
import com.rodriguez.giomar.repository.PlayerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class PlayerRepositoryIntegrationTest {
    @Autowired
    PlayerRepository playerRepository;

    @Test
    public void whenFindById_thenReturnPlayer(){
        String playerId= "abercda01";
        Player found = playerRepository.findOne("abercda01");

        assertThat(playerId).isEqualTo(found.getPlayerID());
    }

}
