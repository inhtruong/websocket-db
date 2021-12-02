package com.ait.websocketdb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

import com.ait.websocketdb.dto.MessageDto;
import com.ait.websocketdb.entity.Message;
import com.ait.websocketdb.repository.MessageRepository;
import com.ait.websocketdb.response.Greeting;

@Service
public class MessageImplService implements MessageService{
	@Autowired
	MessageRepository repository;

	@Override
	public Iterable<Message> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Message> findById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Message save(Message message) {
		// TODO Auto-generated method stub
		return repository.save(message);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Message create(MessageDto mDto) {
		Message message = new Message();
		
		if(mDto != null) {
			message.setContent(mDto.getContent());
			
			return repository.save(message);
		}
		return null;
	}

	@Override
	public boolean delete(Long id) {
		Optional<Message> messeage = findById(id);
		
		if (messeage.isPresent()) {
			deleteById(id);
			return true;
		} 
		return false;
	}

	@Override
	public Greeting findMessById(Long id) {
		Optional<Message> messeage = findById(id);

		return messeage.map(message -> new Greeting(message.getId(), HtmlUtils.htmlEscape(message.getContent()))).orElse(null);
	}

	@Override
	public Message update(Long id, MessageDto mDto) {
		Optional<Message> message = findById(id);
		
		if (message.isPresent()) {
			if (mDto.getContent() != null && !message.get().getContent().equals(mDto.getContent())) {
				message.get().setContent(mDto.getContent());
			}
			
			return repository.save(message.get());
		}
		return null;
	}

	
	
}
