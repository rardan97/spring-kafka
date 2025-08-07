package com.blackcode.spring_kafka;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private final KafkaTemplate<String, LogEvent> kafkaTemplate;
    private static final String TOPIC = "log-event";

    public KafkaProducerService(KafkaTemplate<String, LogEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendLogEvent(LogEvent logEvent){
        kafkaTemplate.send(TOPIC, logEvent);
    }
}
