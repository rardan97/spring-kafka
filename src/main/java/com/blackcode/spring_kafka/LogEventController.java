package com.blackcode.spring_kafka;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LogEventController {

    private final KafkaProducerService producerService;


    public LogEventController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public ResponseEntity<String> sendLogs(@RequestBody LogEvent logEvent){
        producerService.sendLogEvent(logEvent);
        return ResponseEntity.ok("LogEvent sent to Kafka");
    }
}
