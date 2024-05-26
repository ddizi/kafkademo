package com.example.kafkademo.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    @DisplayName("Create new customer")
    void createNewCustomer() {
        CustomerDto customerDto = CustomerDto.builder()
                .customerName("John Doe")
                .age(30)
                .genderCode("1")
                .build();
        CustomerDto customer = customerService.createCustomer(customerDto);
        assertEquals(30, customer.getAge());
    }

    @Test
    @DisplayName("Get customer")
    void getCustomer() {
        CustomerDto customerDto = CustomerDto.builder()
                .customerName("John Doe")
                .age(30)
                .genderCode("1")
                .build();
        CustomerDto customer = customerService.createCustomer(customerDto);
        CustomerDto customerFromDb = customerService.getCustomer(customer.getCustomerId().toString());
        assertEquals("John Doe", customerFromDb.getCustomerName());
    }
}