package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.enums.ErrorResponse;
import com.example.demo.exception.NotFoundException;
import com.example.demo.service.UserDaoService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private UserDaoService userdaoservice;
	
	@GetMapping("/getUserEx")
	public ResponseEntity<Object> getUser(){
		throw new NotFoundException(ErrorResponse.USER_NOT_FOUND);
	}
	
	@Autowired
	public UserController(UserDaoService userdaoservice) {
		super();
		userdaoservice = this.userdaoservice;
	}
	
	@GetMapping("/user")
	public List<User> getAllUser(){
		return userdaoservice.findAll();
	}
	
	@GetMapping("/user/{id}")
	public List<User> getUserById(@PathVariable int id){
		return userdaoservice.findAll();
	}
	
	@PutMapping("/user")
	public User createUser(@RequestBody User user) {
		return userdaoservice.createUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteById(@PathVariable int id) {
		 userdaoservice.deleteById(id);
	}

	@DeleteMapping("/user")
	public void deleteAll() {
		userdaoservice.deleteAll();
	}
}
