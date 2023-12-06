package com.zakariyakhan.flights;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.zakariyakhan.flights.Flight;

public interface FlightRepository extends MongoRepository<Flight, String> {
    List<Flight> findByFlightNum(String flightNum);

    // { $match: { $expr: { $gt: [‘$actual_timestamp’, ‘$scheduled_timestamp’] } } }, { $sort: { ‘airline’: 1} } 
    // @Aggregation("{ $match: { $expr: { $gt: ['$actual_timestamp', '$scheduled_timestamp'] } } }, { $sort: { 'airline': 1} }}")
    // List<Flight> recentDelayedFlights();
}
