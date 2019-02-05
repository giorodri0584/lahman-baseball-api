package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.Batting;
import com.rodriguez.giomar.model.CompositeId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattingRepository extends CrudRepository<Batting, CompositeId>, JpaSpecificationExecutor<Batting> {
    Page<Batting> findByBattingIdPlayerID(String playerID, Pageable pageable);
    Page<Batting> findAll(Pageable pageable);
    Page<Batting> findAll(Specification<Batting> specification, Pageable pageable);
}
