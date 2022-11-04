package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entities.Booking;
import com.flight.entities.Reservation;
import com.flight.service.ReservationService;


@RestController
@RequestMapping("/flightreservation")
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@PostMapping("/bookflight")
	public Reservation bookFlight(@RequestBody Reservation reservation) {
		return reservationService.bookFlight(reservation);
	}
	
}
