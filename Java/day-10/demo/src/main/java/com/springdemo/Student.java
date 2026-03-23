package com.springdemo;

public class Student {
    String name;
    Address address;
    public Student(String name, Address address) {
        System.out.println("Parameterized constructor for student called");
        this.name = name;
        this.address = address;
    }
    public Student(){
        System.out.println("Default constructor for student called");
    }
    public String getName() {
        return name;
    }
    public Address getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + "]";
    }
}
