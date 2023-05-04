package com.SneakerStroll.entity;

import java.util.List;

public class cart {
	
	List<String>s_id;

	public List<String> getS_id() {
		return s_id;
	}

	public void setS_id(List<String> s_id) {
		this.s_id = s_id;
	}

	public cart(List<String> s_id) {
		super();
		this.s_id = s_id;
	}

	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "cart [s_id=" + s_id + "]";
	}
}
