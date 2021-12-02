package com.ait.websocketdb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table (name = "messages")
public class Message {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	
	private String content;
	
	@Column(name = "created_datetime")
	@CreationTimestamp
	private Date createAt;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public Message(long id, String content, Date createAt) {
		super();
		this.id = id;
		this.content = content;
		this.createAt = createAt;
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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	
	
}
