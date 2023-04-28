package com.SneakerStroll.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SneakerStroll.entity.Sneaker;

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
}
