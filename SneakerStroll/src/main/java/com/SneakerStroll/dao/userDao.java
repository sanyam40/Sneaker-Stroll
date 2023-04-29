package com.SneakerStroll.dao;

import java.util.List;

import com.SneakerStroll.entity.User;

public interface userDao {
	
	public int user_signup(User user);
	
	public List<User> userlogin(String email,String password);

}
