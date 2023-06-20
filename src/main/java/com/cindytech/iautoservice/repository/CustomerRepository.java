package com.cindytech.iautoservice.repository;

import com.cindytech.iautoservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
