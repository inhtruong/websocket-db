package com.ait.websocketdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ait.websocketdb.dto.MessageDto;
import com.ait.websocketdb.entity.Message;
import com.ait.websocketdb.service.MessageService;

public class MessageController {
	
	@Autowired
	MessageService service;

	@PostMapping
    public ResponseEntity<Message> createPost(@RequestBody MessageDto post){
        return new ResponseEntity<>(service.create(post),HttpStatus.CREATED);
    }
}
