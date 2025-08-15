package com.emirhan.customer.customer_registration_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    Long id;
    @Pattern(regexp = "[a-zA-ZçÇğĞıİöÖşŞüÜ]+", message = "Name must contain only letters.")
    @NotBlank(message = "First name is required")
    @Column(nullable = false)
    private String firstName;
    @Pattern(regexp = "[a-zA-ZçÇğĞıİöÖşŞüÜ]+", message = "Name must contain only letters.")
    @NotBlank(message = "Last name is required")
    @Column(nullable = false)
    private String lastName;
    @NotBlank(message = "E-mail is required")
    @Column(nullable = false) private
    String email;

    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
