package com.zakariyakhan.flights;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.zakariyakhan.flights.Flight;
import com.zakariyakhan.flights.FlightRepository;

@Controller
public class FlightController {
    private final FlightRepository flightRepository;

    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @QueryMapping
    public List<Flight> flights() {
        return flightRepository.findAll();
    }

    @QueryMapping
    public List<Flight> flightsByFlightNum(@Argument String flightNum) {
        return flightRepository.findByFlightNum(flightNum);
    }

    // @QueryMapping
    // public List<Flight> recentDelayedFlights() {
    //     return flightRepository.recentDelayedFlights();
    // }

}
