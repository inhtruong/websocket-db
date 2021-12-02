package com.ait.websocketdb.response;

public class Greeting {

	private Long id;

	private String content;

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

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
