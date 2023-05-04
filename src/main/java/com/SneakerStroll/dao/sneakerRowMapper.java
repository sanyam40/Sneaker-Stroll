package com.SneakerStroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SneakerStroll.entity.Sneaker;

public class sneakerRowMapper implements RowMapper<Sneaker> {
	
	@Override
	public Sneaker mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Sneaker sneaker=new Sneaker();
		
		sneaker.setS_id(rs.getString("s_id"));
		sneaker.setName(rs.getString("name"));
		sneaker.setPrice(rs.getString("price"));
		
		return sneaker;
	}

}
