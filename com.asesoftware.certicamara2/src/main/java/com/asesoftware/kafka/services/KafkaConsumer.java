package com.asesoftware.kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.asesoftware.kafka.model.Log;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics="${jsa.kafka.topic}")
    public void processMessage(Log customer) {
		System.out.println("received content = " + customer);
    }
}