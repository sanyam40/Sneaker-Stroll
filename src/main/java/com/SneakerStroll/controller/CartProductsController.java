package com.SneakerStroll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.SneakerStroll.entity.Sneaker;
import com.SneakerStroll.entity.User;
import com.SneakerStroll.entity.cart;
import com.SneakerStroll.service.sneakerService;
import com.SneakerStroll.service.userService;

@Controller
public class CartProductsController {
	
	@Autowired
	private sneakerService sneakerService;
	
	@Autowired
	private userService userService;
	
	@ModelAttribute("cart")
	public cart getCart() {
		return new cart();
	}
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping("/display-cart")
	public String display_cart(@SessionAttribute("cart-products")List<String> list,Model model) {
		
		System.out.println(list);
		
		//List<Sneaker>list2=sneakerService.getcart();
		
		return "cart-page";
	}
}
	
