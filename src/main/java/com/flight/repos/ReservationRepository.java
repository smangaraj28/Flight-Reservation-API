package com.flight.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.Flight;
import com.flight.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
