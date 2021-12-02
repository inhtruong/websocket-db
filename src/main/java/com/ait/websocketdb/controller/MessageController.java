package com.ait.websocketdb.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.websocketdb.dto.MessageDto;
import com.ait.websocketdb.entity.Message;
import com.ait.websocketdb.service.MessageService;

@RestController
@RequestMapping("/api/mess")
public class MessageController {
	
	@Autowired
	MessageService service;

	@GetMapping
	public ResponseEntity<Iterable<Message>> allMessage() {
		Iterable<Message> messages = service.findAll();
		
		if(((List<Message>) messages).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(messages, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Message> findMessageById(@PathVariable Long id) {
			Optional<Message> message = service.findById(id);
			
			if(!message.isPresent()) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<>(message.get(), HttpStatus.OK);
	}
	
	@GetMapping("/{offTime}/{onTime}")
	public ResponseEntity<Iterable<Message>> findMessageInTime(@PathVariable Date offTime, @PathVariable Date onTime) {
		Iterable<Message> messages = service.findMessageInTime(offTime, onTime);
		return new ResponseEntity<>(messages, HttpStatus.OK);
        
	}
	
	@PostMapping
    public ResponseEntity<Message> createMessage(@RequestBody MessageDto message){
        return new ResponseEntity<>(service.create(message),HttpStatus.CREATED);
    }
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable Long id) {
		return service.delete(id);
	}
	
	@PatchMapping("/{id}")
	 public ResponseEntity<Message> updateMessage(@PathVariable Long id, @RequestBody MessageDto message){
        return new ResponseEntity<>(service.update(id, message),HttpStatus.OK);
    }
}
