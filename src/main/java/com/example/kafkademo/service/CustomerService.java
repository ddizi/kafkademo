package com.example.kafkademo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public String getCustomer(String customerId) {

        CustomerDto customerDto = CustomerDto.builder()
                .customerId(customerId)
                .customerName("John Doe")
                .gender("male")
                .build();
        CompletableFuture<SendResult<String, Object>> testTopic = kafkaTemplate.send("testTopic", "1234", customerDto);

        return "Customer ID: " + customerId + " is found.";
    }
}
