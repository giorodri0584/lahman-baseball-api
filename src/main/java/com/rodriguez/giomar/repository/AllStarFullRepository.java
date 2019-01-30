package com.rodriguez.giomar.repository;

import com.rodriguez.giomar.model.AllStarFull;
import com.rodriguez.giomar.model.AllStartFullCompositeId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllStarFullRepository extends CrudRepository<AllStarFull, AllStartFullCompositeId> {
}
