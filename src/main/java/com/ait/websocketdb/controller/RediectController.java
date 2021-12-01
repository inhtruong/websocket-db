package com.ait.websocketdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RediectController {
	@GetMapping("/noti")
	public String showNoti() {
		return "/notification";
	}

}
