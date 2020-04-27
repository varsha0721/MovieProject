package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserDaoService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private UserDaoService userdaoservice;
	
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
	public List<User> getUserById(@PathVariable String id){
		return userdaoservice.findAll();
	}
	
	@PutMapping("/user")
	public User createUser(@RequestBody User user) {
		return userdaoservice.save(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteById(@PathVariable String id) {
		 userdaoservice.deleteById(id);
	}

	@DeleteMapping("/user")
	public void deleteAll() {
		userdaoservice.deleteAll();
	}
}
