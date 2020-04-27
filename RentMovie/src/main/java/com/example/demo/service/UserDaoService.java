package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;

@Service
public class UserDaoService implements UserDAO {
	
	public UserDAO userDAO;
	
	@Autowired
	public UserDaoService(UserDAO userDao) 
	{
		super();
		userDao = this.userDAO;
	}

	@Override
	@Transactional
	public List<User> findAll() {
		
		return userDAO.findAll();
	}

	@Override
	@Transactional
	public Optional<User> findById(String id) {
		Optional<User> user = userDAO.findById(id);
		return user;
	}

	@Override
	@Transactional
	public User createUser(User user) {
		return userDAO.save(user);
	}

	@Override
	@Transactional
	public void deleteById(String id) {
		userDAO.deleteById(id);
		
	}

	@Override
	@Transactional
	public void deleteAll() {
		userDAO.deleteAll();
		
	}
		
}
