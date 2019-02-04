package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by giorod on 9/28/2017.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, String>, JpaSpecificationExecutor<Player> {
    Page<Player> findAll(Specification spec, Pageable pageable);
    Page<Player> findAll(Pageable pageable);
    Player findByPlayerID(String playerID);
}
