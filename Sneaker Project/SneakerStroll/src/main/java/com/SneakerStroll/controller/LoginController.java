package com.SneakerStroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login-page")
	public String login_page() {
		return "login-page";
	}

}