package com.ait.websocketdb.response;

public class Greeting {

	private Long id;
	private String content;
	private String type;

	public Greeting() {
	}

	public Greeting(String content) {
		this.content = content;
	}

	public Greeting(Long id, String content) {
		super();
		this.id = id;
		this.content = content;
	} 

	public Greeting(Long id, String content, String type) {
		super();
		this.id = id;
		this.content = content;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getType() {
		return type;
	}
}
