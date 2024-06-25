package com.example.kafkademo.component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class SpringKafkaProducer implements MessageProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void send(String topic, String key, Object body) {
        kafkaTemplate.send("testTopic", key, body);
        log.info("Spring Kafka -> Sent message to topic: {}, key: {}, body: {}", topic, key, body);
    }
}
