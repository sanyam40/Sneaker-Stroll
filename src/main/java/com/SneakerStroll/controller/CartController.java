package com.SneakerStroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SneakerStroll.service.sneakerService;

@Controller
@SessionAttributes("cart-products")
public class CartController {
	
	@Autowired
	private sneakerService sneakerService;
	
	@RequestMapping("/add-to-cart")
	public String addto_cart(@RequestParam("s_id")String s_id,Model model) {
		
		//int r=sneakerService.savetocart(s_id);
		//System.out.println(r);
		
		return "redirect:/home";
	}
}
