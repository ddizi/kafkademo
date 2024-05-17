package com.example.kafkademo.service;

import com.example.kafkademo.entity.CustomerEntity;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CustomerDto {
    private Integer customerId;
    private String customerName;
    private int age;
    private String genderCode;

    public static CustomerEntity toEntity(CustomerDto customerDto) {
        return CustomerEntity.builder()
                .age(customerDto.getAge())
                .customerName(customerDto.getCustomerName())
                .genderCode(customerDto.getGenderCode())
                .build();
    }

    public static CustomerDto fromEntity(CustomerEntity entity) {
        return CustomerDto.builder()
                .age(entity.getAge())
                .customerName(entity.getCustomerName())
                .customerId(entity.getId())
                .genderCode(entity.getGenderCode())
                .build();
    }
}
