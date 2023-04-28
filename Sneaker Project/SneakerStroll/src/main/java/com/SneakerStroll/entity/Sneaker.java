package com.SneakerStroll.entity;


public class Sneaker {
	
	private String s_id;
	private String name;
	private String price;
	
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Sneaker(String s_id, String name, String price) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.price = price;
	}
	public Sneaker() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sneaker [s_id=" + s_id + ", name=" + name + ", price=" + price + "]";
	}
}
