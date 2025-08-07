package com.blackcode.spring_kafka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LogEvent {
    private String level;
    private String message;
    private long timestamp;
}
