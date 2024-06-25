package com.example.kafkademo.component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaClientProducer implements MessageProducer{

    private final KafkaProducer<String, Object> kafkaProducer;

    @Override
    public void send(String topic, String key, Object body) {
        ProducerRecord<String, Object> record = new ProducerRecord<>(topic, body);
        kafkaProducer.send(record);
        kafkaProducer.close();
        log.info("Kafka Client -> Sent message to topic: {}, key: {}, body: {}", topic, key, body);
    }
}
