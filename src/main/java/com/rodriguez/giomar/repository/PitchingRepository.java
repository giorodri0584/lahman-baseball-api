package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.CompositeId;
import com.rodriguez.giomar.model.Pitching;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by giorod on 8/22/2018.
 */
@Repository
public interface PitchingRepository extends CrudRepository<Pitching, CompositeId>, JpaSpecificationExecutor<Pitching>{
    List<Pitching> findByPitchingIdPlayerID(String playerID);
    List<Pitching> findAll(Pageable pageable);
}
