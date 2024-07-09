package com.springsecurity.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.springsecurity.model.User;
import com.springsecurity.springsecurity.model.UserRequest;
import com.springsecurity.springsecurity.model.UserResponse;
import com.springsecurity.springsecurity.service.IUserService;
import com.springsecurity.springsecurity.util.JwtUtil;

@RestController
@RequestMapping("/user")
public class UserRestController
{

	@Autowired
	private IUserService service;
	
	@Autowired
	private JwtUtil util;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user)
	{
		Integer id = service.saveUser(user);
		String body = "User '"+id+"' inserted ";
		return ResponseEntity.ok(body);
	}
	
	@GetMapping("/find")
	public List<User>  getDetails()
	{
		return this.service.getDetails();
	}
	
	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser (@RequestBody UserRequest  request)
	{
		String token = util.generateToken(request.getUsename());
		
		
		return ResponseEntity.ok(new UserResponse(token ,"Success!.."));
	}
}
