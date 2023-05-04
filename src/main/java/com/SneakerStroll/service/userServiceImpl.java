package com.SneakerStroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SneakerStroll.dao.userDao;
import com.SneakerStroll.entity.User;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	private userDao userDao;

	@Override
	public int signup(User user) {
		// TODO Auto-generated method stub
		
		System.out.println("USER AT SERVICE : "+user);
		
		int r=userDao.user_signup(user);
		
		return r;
	}
	
	public List<User> login(String username,String password){
		
		List<User>list=userDao.userlogin(username, password);
		
		return list;
		
	}
	
	public List<User> cart(List<String>list){
		List<User>list2=userDao.cart(list);
		return list2;
	}

}
