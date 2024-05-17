package com.example.kafkademo.service;

import com.example.kafkademo.entity.CustomerEntity;
import com.example.kafkademo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final CustomerRepository customerRepository;

    public CustomerDto getCustomer(String customerId) {

        CustomerEntity entity = customerRepository.findById(Integer.parseInt(customerId))
                .orElseThrow(() -> new RuntimeException("Customer ID: " + customerId + " is not found."));

        return CustomerDto.fromEntity(entity);
    }

    public CustomerDto createCustomer(CustomerDto customerDto) {
        CustomerEntity entity = customerRepository.save(CustomerDto.toEntity(customerDto));
        kafkaTemplate.send("testTopic", customerDto.getCustomerId().toString(), customerDto);
        return CustomerDto.fromEntity(entity);
    }
}
