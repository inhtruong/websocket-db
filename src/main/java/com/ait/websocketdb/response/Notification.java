package com.ait.websocketdb.response;

import java.time.LocalDateTime;

public class Notification {
	private String notiString;
	private LocalDateTime timeDate;

	public Notification(String notiString) {
		super();
		this.notiString = notiString;
	}

	public Notification(String notiString, LocalDateTime localDateTime) {
		super();
		this.notiString = notiString;
		this.timeDate = localDateTime;
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

	public LocalDateTime getTimeDate() {
		return timeDate;
	}

	public void setTimeDate(LocalDateTime timeDate) {
		this.timeDate = timeDate;
	}
	
	
}
