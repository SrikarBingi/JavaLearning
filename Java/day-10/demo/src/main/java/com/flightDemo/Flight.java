package com.flightDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//default bean name is class name camelcase
@Component
public class Flight {

    @Autowired
    FlightService flightService;
    public Flight() {
        System.out.println("constructor called");
    }

    public FlightService getFlightService() {
        return flightService;
    }

    public void setFlightService(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostConstruct //make db connection once object is created
    //log something once object is created
    public void postConstructMethod(){
        System.out.println("called after construction");
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("called before pre destroy");
    }
}
