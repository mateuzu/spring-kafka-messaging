package com.ms.helloconsumer.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.helloconsumer.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, UUID>{

}
