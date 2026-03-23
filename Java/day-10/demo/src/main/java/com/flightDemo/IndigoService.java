package com.flightDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class IndigoService implements FlightService{

    @Override
    public List<String> flightNames() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'flightNames'");
        List<String> flights = new ArrayList<>();
        flights.add("Indigo 1");
        return flights;
    }

}
