package com.model;

public class Address {
	
	private int addrID;
	private String street;
	
	
	
	public Address() {
		super();
	}
	public Address(int addrID, String street) {
		super();
		this.addrID = addrID;
		this.street = street;
	}
	public int getAddrID() {
		return addrID;
	}
	public void setAddrID(int addrID) {
		this.addrID = addrID;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [addrID=" + addrID + ", street=" + street + "]";
	}
	
	
}
