package com.example.spring_security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_security.models.User;
import com.example.spring_security.service.AuthService;

@RestController
@RequestMapping("auth")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user) {
		String res =  authService.register(user);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<User> findUserById(@PathVariable("id") String id) {
		return ResponseEntity.status(200).body(authService.getUser(id));
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		return authService.login(user);
	}
}
