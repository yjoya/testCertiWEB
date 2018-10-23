package com.asesoftware.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.kafka.model.Log;
import com.asesoftware.kafka.services.KafkaProducer;

@RestController
@RequestMapping(value = "/my-topic/")
public class ApacheKafkaWebController {

	@Autowired
	KafkaProducer kafkaSender;

	@RequestMapping(value = "/producer")
	public String producer(@RequestParam("id") String id,
			@RequestParam("service") String service,
			@RequestParam("name") String name,
			@RequestParam("lastname") String lastname,
			@RequestParam("date") String date) {
		
		Log log = new Log(id, service, name, lastname, date);
		kafkaSender.send(log);

		return "Message sent to the Kafka Topic my-topic Successfully";
	}

}

