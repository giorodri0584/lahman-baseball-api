package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.CompositeId;
import com.rodriguez.giomar.model.Fielding;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by giorod on 9/6/2018.
 */
@Repository
public interface FieldingRepository extends CrudRepository<Fielding, CompositeId>, JpaSpecificationExecutor<Fielding> {
    List<Fielding> findByCompositeIdPlayerID(String playerId);
    List<Fielding> findAll(Pageable pageable);
}
