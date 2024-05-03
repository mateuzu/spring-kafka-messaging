package com.ms.helloproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.helloproducer.producer.Producer;

@RestController
@RequestMapping("producer/")
public class ProducerController {

	@Autowired
	private Producer producer;
	
	@PostMapping("/message/{message}")
	public ResponseEntity<String> publishMessage(@PathVariable("message") String message) {
		producer.sendMessage(message);
		return ResponseEntity.ok("OK");
	}
}
