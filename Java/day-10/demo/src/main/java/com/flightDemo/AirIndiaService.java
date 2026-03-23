package com.flightDemo;

import java.util.ArrayList;
import java.util.List;



import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //this has high priority if we have multiple bean of same type (Flight Service)
public class AirIndiaService implements FlightService{

    @Override
    public List<String> flightNames() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'flightNames'");
        List<String> flights = new ArrayList<>();
        flights.add("air India 1");
        return flights;
    }

}
