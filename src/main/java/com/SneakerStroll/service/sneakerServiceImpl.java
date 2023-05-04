package com.SneakerStroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SneakerStroll.dao.sneakerDao;
import com.SneakerStroll.entity.Sneaker;

@Service
public class sneakerServiceImpl implements sneakerService {
	
	@Autowired
	private sneakerDao sneakerDao;

	@Override
	public List<Sneaker> getSneakers() {
		// TODO Auto-generated method stub
		
		List<Sneaker>list=sneakerDao.getSneakerDetail();
		
		System.out.println("AT SERVICE LEVEL : "+list);

		return list;
	}
	
	public List<Sneaker> getById(String id){
		
		List<Sneaker>list=sneakerDao.getSneakerbyId(id);
		
		return list;
		
	}
	
	/*public List<Sneaker> getcart(){
		
		String queryString="select * from cart";
		
		
		return list2;
	}*/
	
	public int savetocart(String id) {
		int r=sneakerDao.savetocart(id);
		return r;	
	}

}
