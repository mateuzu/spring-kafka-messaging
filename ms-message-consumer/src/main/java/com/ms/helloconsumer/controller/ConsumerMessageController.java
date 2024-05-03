package com.ms.helloconsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.helloconsumer.entities.Message;
import com.ms.helloconsumer.service.ConsumerMessageService;

@RestController
@RequestMapping("/consumer")
public class ConsumerMessageController {

	private ConsumerMessageService service;

	@Autowired
	public ConsumerMessageController(ConsumerMessageService service) {
		this.service = service;
	}
	
	@GetMapping("/message/all")
	public ResponseEntity<List<Message>> listAll(){
		var list = service.listAll();
		return ResponseEntity.ok(list);
	}
}
