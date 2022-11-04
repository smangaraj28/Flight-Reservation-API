package com.flight.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entities.Flight;
import com.flight.service.FlightService;


@RestController
@RequestMapping("/flightreservation")
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	// Enable for the Admin
	@PostMapping("/addFlight")
	public Flight addFlight(@RequestBody Flight flight) {
		return flightService.addFlight(flight);
	}
	
	@GetMapping("/findflights")
	public List<Flight> findFlights(@RequestParam("arrivalCity") String arrivalCity,
			@RequestParam("departureCity") String departureCity,
			@RequestParam("departureDate")
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date departureDate) {
		return flightService.findFlights(arrivalCity, departureCity, departureDate);
	}
	
}
