package com.emirhan.customer.customer_registration_system.controller;

import com.emirhan.customer.customer_registration_system.model.Customer;
import com.emirhan.customer.customer_registration_system.repository.CustomerRepository;
import com.emirhan.customer.customer_registration_system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/")
    public String listCustomers(Model model) {
        List<Customer> customers = customerService.findAll();//Müşteri listesini çekme
        model.addAttribute("customers", customers); //Müşteri listesini modele ekleme. Html içinden çekilecek
        return "customer-list";
    }
@GetMapping("/customers/showFormForAdd")
    public String showFormForAdd(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";

}

@PostMapping("/customers/save")
    public String saveCustomers(Customer customer) {
        customerService.save(customer);
        return "redirect:/";
}

@GetMapping("/customers/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("id") Long customerId,   Model model) {
        Customer customer = customerService.findById(customerId);
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/customers/delete")
    public String deleteCustomers(@RequestParam("id") Long customerId) {
        customerService.deleteById(customerId);
        return "redirect:/";
    }
}
