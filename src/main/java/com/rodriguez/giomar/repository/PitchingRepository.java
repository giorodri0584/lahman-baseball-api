package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.CompositeId;
import com.rodriguez.giomar.model.Pitching;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PitchingRepository extends CrudRepository<Pitching, CompositeId>, JpaSpecificationExecutor<Pitching>{
    Page<Pitching> findByPitchingIdPlayerID(String playerID, Pageable pageable);
    Page<Pitching> findAll(Pageable pageable);
}
