package com.reymi.tipmerge.repository;

import com.reymi.tipmerge.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findById(Long id);
}
