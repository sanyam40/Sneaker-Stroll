package com.SneakerStroll.service;

import java.util.List;

import com.SneakerStroll.entity.Sneaker;

public interface sneakerService {
	
	public List<Sneaker> getSneakers();
	
	public List<Sneaker> getById(String id);

}
