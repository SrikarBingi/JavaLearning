package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	private int orderID;
	
	private int countOfItems;
	
	private int price;

	
	
	public Order() {
		super();
	}

	public Order(int countOfItems, int price) {
		super();
		this.countOfItems = countOfItems;
		this.price = price;
	}

	public Order(int orderID, int countOfItems, int price) {
		super();
		this.orderID = orderID;
		this.countOfItems = countOfItems;
		this.price = price;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getCountOfItems() {
		return countOfItems;
	}

	public void setCountOfItems(int countOfItems) {
		this.countOfItems = countOfItems;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", countOfItems=" + countOfItems + ", price=" + price + "]";
	}
	
	
}
