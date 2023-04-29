package com.SneakerStroll.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SneakerStroll.entity.User;
import com.SneakerStroll.service.userService;

@Controller
public class LoginController {
	
	@Autowired
	private userService userService;
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping("/login-page")
	public String login_page() {
		return "login-page";
	}
	
	@RequestMapping("/SignUp-page")
	public String signup_page() {
		return "SignUp-page";
	}
	
	
	@RequestMapping("/login")
	public String login(@Valid @ModelAttribute("user")User user,BindingResult bindingresult) {
		
		if(bindingresult.hasErrors()) {
			return "Admin-login";
		}
		else {
			List<User>list=userService.login(user.getEmail(), user.getPassword());
			System.out.println(list);
			if(list.isEmpty()) {
				// Means It is an empty set & USERNAME AND PASSWORD IS INCORRECT 
				
				return "redirect:/login-page";
			}
			else {
				// FOR CORRECT USERNAME AND PASSWORD
				System.out.println("CORRECT");
				return "home";
			}	
		}
	}
	
	@RequestMapping("/signup")
	public String signup(@ModelAttribute("user")User user) {
		System.out.println("USER AT CONTROLLER : "+user);
		
		int r=userService.signup(user);
		System.out.println(r);
		
		return "login-page";
	}
}
