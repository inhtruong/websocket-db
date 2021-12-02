package com.ait.websocketdb.response;

public class Notification {
	private String notiString;

	public Notification(String notiString) {
		super();
		this.notiString = notiString;
	}

	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNotiString() {
		return notiString;
	}

	public void setNotiString(String notiString) {
		this.notiString = notiString;
	}

}
