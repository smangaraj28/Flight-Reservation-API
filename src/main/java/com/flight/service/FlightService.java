package com.flight.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.entities.Flight;
import com.flight.repos.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	FlightRepository flightRepository;
	
	public List<Flight> findFlights(String from, String to, Date departureDate ) {
		List<Flight> flights = flightRepository.findFlights(from, to, departureDate);
		return flights;
	}

	public Flight addFlight(Flight flight) {
		return flightRepository.save(flight);
	}


}
