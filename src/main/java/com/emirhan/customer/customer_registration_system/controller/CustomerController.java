package com.emirhan.customer.customer_registration_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class CustomerController {
    @GetMapping("/")
    public String listCustomers(Model model) {
        // Müşteri listesini Model'e ekleyeceğiz
        // List<Customer> theCustomers = ...; // Buraya repository'den veri çekme kodu gelecek
        // model.addAttribute("customers", theCustomers);
        return "customer_list";
    }

}
