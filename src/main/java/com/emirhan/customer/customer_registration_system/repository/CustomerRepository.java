package com.emirhan.customer.customer_registration_system.repository;

import com.emirhan.customer.customer_registration_system.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {//Id long oldugu için long kullanıldı.

}
