package com.springdemo;

public class Address {
    String pincode;
    String city;
    public Address(String pincode, String city) {
        System.out.println("Parameterized constructor for address called");
        this.pincode = pincode;
        this.city = city;
    }
    public Address(){
        System.out.println("default constructor for address called");
    }
    @Override
    public String toString() {
        return "Address [pincode=" + pincode + ", city=" + city + "]";
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPincode() {
        return pincode;
    }
    public String getCity() {
        return city;
    }

}
