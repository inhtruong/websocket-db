package com.ait.websocketdb.controller;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.ait.websocketdb.dto.NotiDto;
import com.ait.websocketdb.entity.Message;
import com.ait.websocketdb.response.Greeting;
import com.ait.websocketdb.response.Notification;
import com.ait.websocketdb.service.MessageService;

@Controller
public class GreetingController {
	@Autowired
	MessageService service;
	
	@MessageMapping("/send")
	@SendTo("/topic/greetings")
	public Greeting greeting(Long id) throws Exception {
		Optional<Message> message = service.findById(id);
		
		Thread.sleep(1000); // simulated delay
		return new Greeting(message.get().getId(), "Hello, " + HtmlUtils.htmlEscape(message.get().getContent()) + "!");
	}

	@MessageMapping("/delete")
	@SendTo("/topic/delete")
	public Greeting delete(Long id) throws Exception {
		Optional<Message> message = service.findById(id);

		Thread.sleep(1000); // simulated delay
		return new Greeting(message.get().getId(), "Hello, " + HtmlUtils.htmlEscape(message.get().getContent()) + "!");
	}

	@MessageMapping("/edit")
	@SendTo("/topic/edit")
	public Greeting edit(Long id) throws Exception {
		Optional<Message> message = service.findById(id);

		Thread.sleep(1000); // simulated delay
		return new Greeting(message.get().getId(), "Hello, " + HtmlUtils.htmlEscape(message.get().getContent()) + "!");
	}

	@MessageMapping("/notification")
	@SendTo("/topic/notification")
	public Notification notification(NotiDto noti) throws Exception {
		
		Thread.sleep(1000); // simulated delay
		return new Notification(HtmlUtils.htmlEscape(noti.getNotiString()), LocalDateTime.now());
	}
}
