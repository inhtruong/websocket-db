package com.ait.websocketdb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.websocketdb.dto.MessageDto;
import com.ait.websocketdb.entity.Message;
import com.ait.websocketdb.repository.MessageRepository;

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
			message.setContent(mDto.getContentString());
			
			return repository.save(message);
		}
		
		return null;
	}
}
