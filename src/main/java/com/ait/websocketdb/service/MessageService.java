package com.ait.websocketdb.service;

import java.util.Optional;

import com.ait.websocketdb.dto.MessageDto;
import com.ait.websocketdb.entity.Message;
import com.ait.websocketdb.response.Greeting;

public interface MessageService {

	Iterable<Message> findAll();

	Optional<Message> findById(long id);

	Message save(Message message);

	void deleteById(long id);

	Message create(MessageDto mDto);

	boolean delete(Long id);

	Greeting findMessById(Long id);

	Message update(Long id, MessageDto mDto);

}
