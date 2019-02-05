package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.CompositeId;
import com.rodriguez.giomar.model.Fielding;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldingRepository extends CrudRepository<Fielding, CompositeId>, JpaSpecificationExecutor<Fielding> {
    Page<Fielding> findByCompositeIdPlayerID(String playerId, Pageable pageable);
    Page<Fielding> findAll(Pageable pageable);
}
