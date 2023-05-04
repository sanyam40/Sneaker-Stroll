package com.SneakerStroll.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SneakerStroll.entity.Sneaker;
import com.SneakerStroll.entity.cart;

@Repository
public class sneakerDaoImpl implements sneakerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Sneaker> getSneakerDetail() {
		
		String query="select * from sneaker";
		//List<Sneaker>sneakers=jdbcTemplate.query(query, new BeanPropertyRowMapper<Student>(Student.class));
		
		List<Sneaker>sneakers=jdbcTemplate.query(query,new BeanPropertyRowMapper<Sneaker>(Sneaker.class));
		
		System.out.println("AT DAO LEVEL : "+sneakers);
		
		return sneakers;
	}
	
	@SuppressWarnings("deprecation")
	public List<Sneaker> getSneakerbyId(String id){
		String queryString="select * from sneaker where s_id=?";
		List<Sneaker>sneakers=jdbcTemplate.query(queryString,new Object[] {id},new BeanPropertyRowMapper<Sneaker>(Sneaker.class));
		return sneakers;
	}
	
	@SuppressWarnings("deprecation")
	public List<Sneaker> getCartList(List<String>list){
		
		//String queryString="select * from cart";
		//List<cart>list2=jdbcTemplate.query(queryString,new BeanPropertyRowMapper<>(Student.class));
		
		List<Sneaker>list2=new ArrayList<Sneaker>();
		
		for(String s_id:list) {
			String queryString="select * from sneaker where s_id=?";
			Sneaker sneaker=(Sneaker) jdbcTemplate.query(queryString,new Object[] {s_id},new BeanPropertyRowMapper<Sneaker>(Sneaker.class));
			list2.add(sneaker);
		}
		return list2;
	}
	
	public int savetocart(String s_id) {
		String queryString="insert into cart values(?)";
		int result=jdbcTemplate.update(queryString,s_id);
		return result;
	}
}

