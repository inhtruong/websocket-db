package com.ait.websocketdb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.ait.websocketdb.entity.Message;
import com.ait.websocketdb.response.Greeting;
import com.ait.websocketdb.service.MessageService;

@Controller
public class GreetingController {
	@Autowired
	MessageService service;
	
	@MessageMapping("/send")
	@SendTo("/topic/greetings")
	public Greeting greeting(Long id, String type) throws Exception {
		Optional<Message> message = service.findById(id);
		
		Thread.sleep(1000); // simulated delay
		return new Greeting(message.get().getId(), "Hello, " + HtmlUtils.htmlEscape(message.get().getContent()) + "!", type);
	}

}
