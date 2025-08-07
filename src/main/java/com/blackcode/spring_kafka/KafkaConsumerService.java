package com.blackcode.spring_kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "log-events", groupId = "log-group")
    public void consume(LogEvent logEvent){
        System.out.println("Received logEvent:");
        System.out.println("Level : "+logEvent.getLevel());
        System.out.println("Message: "+logEvent.getMessage());
        System.out.println("Timestamp :"+logEvent.getTimestamp());
    }
}
