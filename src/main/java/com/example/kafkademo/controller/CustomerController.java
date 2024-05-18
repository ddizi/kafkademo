package com.example.kafkademo.controller;

import com.example.kafkademo.controller.dto.CustomerRequest;
import com.example.kafkademo.controller.dto.CustomerResponse;
import com.example.kafkademo.service.CustomerDto;
import com.example.kafkademo.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
@Tag(name = "Response Estimate", description = "Response Estimate API")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable String customerId) {

        return ResponseEntity.ok(CustomerResponse.from(customerService.getCustomer(customerId)));
    }

    @PostMapping("/customer")
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest customerRequest) {
        CustomerDto customer = customerService.createCustomer(CustomerRequest.to(customerRequest));
        return ResponseEntity.ok(CustomerResponse.from(customer));
    }
}
