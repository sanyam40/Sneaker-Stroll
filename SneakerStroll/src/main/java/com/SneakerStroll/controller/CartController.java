package com.SneakerStroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	
	@RequestMapping("/cart-page")
	public String cart_page(){
		return "cart-page";
		
	}

}
