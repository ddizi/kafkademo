package com.example.kafkademo.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public interface MessageProducer {
    public abstract void send(String topic, String key, Object body);
}
