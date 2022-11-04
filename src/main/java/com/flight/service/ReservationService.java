package com.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.entities.Flight;
import com.flight.entities.Passenger;
import com.flight.entities.Reservation;
import com.flight.repos.FlightRepository;
import com.flight.repos.PassengerRepository;
import com.flight.repos.ReservationRepository;

@Service
public class ReservationService {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	public Reservation bookFlight(Reservation reservation) {
		Reservation res = null;
		
		// Get the flight information
		String flightNumber = reservation.getFlight().getFlightNumber();
		Flight flight = flightRepository.findByFlightNumber(flightNumber);
		
		// Insert passenger details in passenger Table
		Passenger passenger = reservation.getPassenger();
		passengerRepository.save(passenger);
		
		reservation.setPassenger(passenger);
		reservation.setFlight(flight);
		
		// Insert reservation details in reservation Table
		res = reservationRepository.save(reservation);
		return res;
	}


}


//{
//	"statusCode": 200,
//	"message": "SuccessFully booked",
//	"data": {
//		{
//		    "checkedIn": true,
//		    "numberOfBags": 2,
//		    "passenger": {
//		        "firstName": "Soumya",
//		        "lastName": "Mangaraj",
//		        "middleName": "Sambit",
//		        "email": "smangaraj@gmail.com",
//		        "phone": "431515425"
//		    },
//		    "flight": {
//		        "flightNumber": "123",
//		        "operatingAirlines": "AIR INDIA",
//		        "departureCity": "AUS",
//		        "arrivalCity": "IND",
//		        "dateOfDeparture": "2022-10-29T18:30:00.000+00:00",
//		        "estimatedDepartureTime": "2022-10-30T16:18:22.000+00:00"
//		    },
//		    "created": "2022-10-30T16:40:12.000+00:00"
//		}
//	}
//}


//Proper API specification

//Swagger.UI ( API specify )
