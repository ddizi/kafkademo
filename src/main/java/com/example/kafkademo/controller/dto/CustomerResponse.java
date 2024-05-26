package com.example.kafkademo.controller.dto;

import com.example.kafkademo.service.CustomerDto;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CustomerResponse {
    private Integer id;
    private String customerName;
    private int age;
    private String genderCode;

    public static CustomerResponse from(CustomerDto customer) {
        return CustomerResponse.builder()
                .id(customer.getCustomerId())
                .customerName(customer.getCustomerName())
                .age(customer.getAge())
                .genderCode(customer.getGenderCode())
                .build();
    }
}
