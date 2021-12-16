package com.example.dojoconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "topic-dojo", groupId = "group_id")
    public void consume(String message) {

        System.out.println("consumed message " + message);

    }
}
