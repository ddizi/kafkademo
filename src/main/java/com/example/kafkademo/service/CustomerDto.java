package com.example.kafkademo.service;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CustomerDto {
    private String customerId;
    private String customerName;
    private String gender;
}
