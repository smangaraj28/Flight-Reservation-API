package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entities.User;
import com.flight.service.UserService;

@RestController
@RequestMapping("/flightreservation")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/signup")
	public User signup(@RequestBody User user) {
		return userService.signup(user);
	}
	
	@PostMapping("/login")
	public boolean login(@RequestParam("username") String email,@RequestParam("password") String password) {
		return userService.login(email, password);
	}

}
