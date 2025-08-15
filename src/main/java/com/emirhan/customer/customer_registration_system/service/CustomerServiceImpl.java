package com.emirhan.customer.customer_registration_system.service;

import com.emirhan.customer.customer_registration_system.model.Customer;
import com.emirhan.customer.customer_registration_system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findById(Long id) {
        // Optional nesnesinden veriyi alıyoruz
        Optional<Customer> result = customerRepository.findById(id);
        Customer customer = null;
        if (result.isPresent()) {
            customer = result.get();
        } else {
            throw new RuntimeException("Did not find customer id - " + id);
        }
        return customer;
    }

    @Override
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
}