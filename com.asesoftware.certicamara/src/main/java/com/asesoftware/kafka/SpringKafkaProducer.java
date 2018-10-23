package com.asesoftware.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.asesoftware.kafka.config", "com.asesoftware.kafka.model", "com.asesoftware.kafka.services"})
public class SpringKafkaProducer{
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaProducer.class, args);
	}
}