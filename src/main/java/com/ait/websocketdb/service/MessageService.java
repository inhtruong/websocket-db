package com.ait.websocketdb.service;

import java.util.Optional;

import com.ait.websocketdb.dto.MessageDto;
import com.ait.websocketdb.entity.Message;

public interface MessageService {

	Iterable<Message> findAll();

    Optional<Message> findById(long id);

    Message save (Message message);

    void deleteById (long id);
    
    Message create(MessageDto mDto);
}
