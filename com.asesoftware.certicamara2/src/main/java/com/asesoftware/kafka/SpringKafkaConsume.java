package com.asesoftware.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asesoftware.kafka.model.Log;
//import com.asesoftware.kafka.services.KafkaProducer;


@SpringBootApplication(scanBasePackages={
"com.asesoftware.kafka.config", "com.asesoftware.kafka.model", "com.asesoftware.kafka.services"})
public class SpringKafkaConsume implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaConsume.class, args);
	}
	
//	@Autowired
//	KafkaProducer producer;
	
	@Override
	public void run(String... arg0) throws Exception {
		// Send Mary customer
//		Customer mary = new Customer("Mary", 31);
//		producer.send(mary);
//		
//		// Send Peter customer
//		Customer peter = new Customer("Peter", 24);
//		producer.send(peter);
	}
}