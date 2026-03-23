package com.annotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    // @Autowired
    private Address address;

    //dont even need to add @autowired in constructor injection
    // public Person(Address address) {
    //     this.address = address;
    // }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

}
