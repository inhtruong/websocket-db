package com.ait.websocketdb.dto;

public class MessageDto {

	private Long id;

	private String content;

	private String status;

	public MessageDto() {
	}

	public MessageDto(String content) {
		this.content = content;
	}

	public MessageDto(Long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public MessageDto(Long id, String content, String status) {
		this.id = id;
		this.content = content;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
