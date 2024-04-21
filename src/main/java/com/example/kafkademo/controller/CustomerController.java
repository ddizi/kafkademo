package com.example.kafkademo.controller;

import com.example.kafkademo.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customer")
@Tag(name = "Response Estimate", description = "Response Estimate API")
public class CustomerController {

    private final CustomerService customerService;

    @RequestMapping("/customer/{customerId}")
    public String getCustomer(@PathVariable String customerId) {

        return customerService.getCustomer(customerId);
    }
}
