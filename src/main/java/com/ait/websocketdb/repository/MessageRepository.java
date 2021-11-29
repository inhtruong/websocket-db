package com.ait.websocketdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ait.websocketdb.entity.Message;

@Repository
public interface MessageRepository extends  JpaRepository<Message, Long>{
	
}
