package com.flightDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.flightDemo");


        // FlightService flightService = (FlightService) applicationContext.getBean("flightService");

        Flight flight = (Flight) applicationContext.getBean("flight");
        System.out.println(flight.getFlightService().flightNames());

        ((AnnotationConfigApplicationContext)applicationContext).close();
    }
}
