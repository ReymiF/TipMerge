package com.reymi.tipmerge.repository;

import com.reymi.tipmerge.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
