package com.model;

public class User {
	
	private int userId;
	private String name;
	Address addr;
	
	public Address getAddr() {
		return addr;
	}



	public void setAddr(Address addr) {
		this.addr = addr;
	}



	public User() {
		
	}
	
	

	public User(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}

	

	public User(String name) {
		super();
		this.name = name;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", addr=" + addr + "]";
	}

	
	
	
}
