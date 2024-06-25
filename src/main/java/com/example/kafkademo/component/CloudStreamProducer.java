package com.example.kafkademo.component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class CloudStreamProducer implements MessageProducer{

//    private final StreamBridge streamBridge;

    @Override
    public void send(String topic, String key, Object body) {
//        streamBridge.send(topic, MessageBuilder.withPayload(body)
//                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
//                .build());
    }
}
