package com.flight.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email); // select * from user where email="" ;

}
