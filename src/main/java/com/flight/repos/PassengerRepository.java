package com.flight.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.Flight;
import com.flight.entities.Passenger;
import com.flight.entities.Reservation;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}

// Requirement Analysis ( API )
// DB Design
// Spring boot Project with dependencies
// Model Creation
// Repos Creation
// Controller Creation
// Service Layer Creation