package com.reymi.tipmerge.service;

import com.reymi.tipmerge.entity.Customer;
import com.reymi.tipmerge.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Customer> getCustomerById(Long id){
        return customerRepository.findById(id);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
