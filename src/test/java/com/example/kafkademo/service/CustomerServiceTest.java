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
    void getCustomer() {
        String customerId = "1234";
        String result = customerService.getCustomer(customerId);
        assertEquals("Customer ID: 1234 is found.", result);
    }
}