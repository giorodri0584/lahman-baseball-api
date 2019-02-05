package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class PlayerRepositoryTest {
    @Autowired
    private PlayerRepository playerRepository;

    @Test
    public void findAll() {
        Page<Player> players = playerRepository.findAll(new PageRequest(0, 20));
        List<Player> playerList = players.getContent();
        assertThat(players.getNumber()).isEqualTo(0);
        assertThat(players.getSize()).isEqualTo(20);
        assertThat(playerList.size()).isEqualTo(20);

    }

    @Test
    public void findByPlayerID() {
        Player player = playerRepository.findByPlayerID("aardsda01");
        assertThat(player).isNotNull();
        assertThat(player.getPlayerID()).isEqualTo("aardsda01");

    }
}