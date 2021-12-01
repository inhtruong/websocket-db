package com.ait.websocketdb.dto;

public class NotiDto {
	private String notiString;

	public NotiDto(String notiString) {
		super();
		this.notiString = notiString;
	}

	public NotiDto() {
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
