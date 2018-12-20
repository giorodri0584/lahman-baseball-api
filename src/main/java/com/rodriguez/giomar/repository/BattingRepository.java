package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.Batting;
import com.rodriguez.giomar.model.CompositeId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by giorod on 10/3/2017.
 */
@Repository
public interface BattingRepository extends CrudRepository<Batting, CompositeId>, JpaSpecificationExecutor<Batting> {
    List<Batting> findByBattingIdPlayerID(String playerID, Pageable pageable);
    List<Batting> findAll(Pageable pageable);
}
