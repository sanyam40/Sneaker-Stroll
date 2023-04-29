package com.SneakerStroll.service;

import java.util.List;

import com.SneakerStroll.entity.User;

public interface userService {
	
	public int signup(User user);
	
	public List<User> login(String email,String password);

}
