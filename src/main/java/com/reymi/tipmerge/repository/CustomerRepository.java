package com.reymi.tipmerge.repository;

import com.reymi.tipmerge.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Create
    Customer save(Customer customer);

    // Read
    Optional<Customer> findById(Long id);
    List<Customer> findAll();

    // Update
    //Customer updateCustomer();

    // Delete
    Customer deleteCustomerById(Long id);
}
