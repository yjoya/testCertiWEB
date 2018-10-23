package com.asesoftware.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.asesoftware.kafka.model.Log;

@Service
public class KafkaProducer {
	@Autowired
	private KafkaTemplate<String, Log> kafkaTemplate;
	
	@Value("${jsa.kafka.topic}")
	String kafkaTopic = "log-service";
	
	public void send(Log customer) {
	    System.out.println("sending data=" + customer);
	    kafkaTemplate.send(kafkaTopic, customer);
	}
}