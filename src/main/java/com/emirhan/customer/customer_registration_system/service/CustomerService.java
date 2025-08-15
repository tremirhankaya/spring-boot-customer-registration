package com.emirhan.customer.customer_registration_system.service;

import com.emirhan.customer.customer_registration_system.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(Long id);

    void deleteById(Long id);
}
