package com.ms.helloconsumer.service;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ms.helloconsumer.entities.Message;
import com.ms.helloconsumer.repository.MessageRepository;

@Service
public class ConsumerMessageService {

	private static Logger logger = LoggerFactory.getLogger(Message.class);
	private MessageRepository messageRepository;

	@Autowired
	public ConsumerMessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	@KafkaListener(topics = "message-topic", groupId = "group-1")
	public void receiveMessage(String message) {
		var saveMessage = new Message(message, LocalDateTime.now());
		messageRepository.save(saveMessage);
		logger.info("CONSUMER - RECEIVED MESSAGE: " + message);
	}
	
	public List<Message> listAll(){
		return messageRepository.findAll();
	}
}
