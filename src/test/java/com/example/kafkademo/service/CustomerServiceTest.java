package com.example.kafkademo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    void createNewCustomer() {
        CustomerDto customerDto = CustomerDto.builder()
                .customerName("John Doe")
                .age(30)
                .genderCode("1")
                .build();
        CustomerDto customer = customerService.createCustomer(customerDto);
        assertEquals(30, customer.getAge());
    }
}