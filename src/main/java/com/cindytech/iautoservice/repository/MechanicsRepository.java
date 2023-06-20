package com.cindytech.iautoservice.repository;

import com.cindytech.iautoservice.model.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicsRepository extends JpaRepository<Mechanic, Integer> {
}
