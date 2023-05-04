package com.SneakerStroll.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SneakerStroll.entity.User;

@Repository
public class userDaoImpl implements userDao {
	
	@Autowired	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int user_signup(User user) {
		
		System.out.println("USER AT DAO  : "+user);
		
		String query="insert into User(firstName,lastName,email,password)values(?,?,?,?)";
		int r=this.jdbcTemplate.update(query,user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword());
		
		return r;
	}
	
	@SuppressWarnings("deprecation")
	public List<User> userlogin(String email,String password){
		List<User>list=new ArrayList<>();
		String query="select email,password from User where email=? and password=?";
		list=jdbcTemplate.query(query, new Object[] {email,password},new BeanPropertyRowMapper<User>(User.class));
		return list;			
	}
	
	@SuppressWarnings("deprecation")
	public List<User> cart(List<String>list){
		List<User>list2=new ArrayList<User>();
		
		for(String email:list) {
			String queryString="select * from User where email=?";
			User user=(User) jdbcTemplate.query(queryString,new Object[] {email},new BeanPropertyRowMapper<User>(User.class));
			list2.add(user);
		}
		return list2;
	}

	

}
