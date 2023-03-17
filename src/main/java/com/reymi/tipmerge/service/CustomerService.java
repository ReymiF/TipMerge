package com.reymi.tipmerge.service;

import com.reymi.tipmerge.entity.Customer;
import com.reymi.tipmerge.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Create
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Read
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    public Optional<Customer> getCustomerById(Long id){
        return customerRepository.findById(id);
    }

    // Update
    @Transactional
    public void updateById(Long id, Customer updatedCustomer) {
        // check if customer exists
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id " + id));

        // update customer's properties
        customer.setPseudo(updatedCustomer.getPseudo());
        customer.setFirstname(updatedCustomer.getFirstname());
        customer.setLastname(updatedCustomer.getLastname());
        customer.setEmail(updatedCustomer.getEmail());

        customerRepository.save(customer);
    }

    // Delete
    @Transactional
    public void deleteById(Long id) {
        // check if customer exists
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id " + id));

        customerRepository.delete(customer);
    }
}
