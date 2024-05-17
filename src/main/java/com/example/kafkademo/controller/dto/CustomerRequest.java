package com.example.kafkademo.controller.dto;

import com.example.kafkademo.service.CustomerDto;
import lombok.Getter;

@Getter
public class CustomerRequest {
    private String customerName;
    private int age;
    private String genderCode;

    public static CustomerDto to(CustomerRequest customerRequest) {
        return CustomerDto.builder()
                .age(customerRequest.getAge())
                .customerName(customerRequest.getCustomerName())
                .genderCode(customerRequest.getGenderCode())
                .build();
    }
}
