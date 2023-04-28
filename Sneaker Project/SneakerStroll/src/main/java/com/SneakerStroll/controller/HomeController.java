package com.SneakerStroll.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SneakerStroll.entity.Sneaker;
import com.SneakerStroll.service.sneakerService;

@Controller
public class HomeController {
	
	@Autowired
	private sneakerService sneakerService;
	
	@ModelAttribute("Sneaker")
	public Sneaker getSneaker() {
		return new Sneaker();
	}

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response,Model model) throws IOException{
		
		List<Sneaker>list=sneakerService.getSneakers();
		System.out.println("AT CONTROLLER LEVEL : "+list);
		
		model.addAttribute("list", list);
		
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/product-display")
	public String product_display(@RequestParam("id")String id,Model model) {
		System.out.println(id);
		
		List<Sneaker>list=sneakerService.getById(id);
		System.out.println(list);
		
		model.addAttribute("list", list);
		
		return "product-display";
	}
	
	@RequestMapping(value="/home")
	public String home() {
		return "home";
	}
}
