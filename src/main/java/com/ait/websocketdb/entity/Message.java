package com.ait.websocketdb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "messages")
public class Message {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	private String content;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
