package com.SneakerStroll.dao;

import java.util.List;

import com.SneakerStroll.entity.Sneaker;

public interface sneakerDao {
	
	public List<Sneaker> getSneakerDetail();
	
	public List<Sneaker> getSneakerbyId(String id);

}
