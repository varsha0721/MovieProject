package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.dao.MovieDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.entity.Movie;

public class MovieDaoService implements MovieDAO {

	private MovieDAO movieDAO;
	@Autowired
	public MovieDaoService(MovieDAO movieDao) 
	{
		super();
		movieDao = this.movieDAO;
	}
	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieDAO.findAll();
	}

	@Override
	public Optional<Movie> findById(Integer id) {
		Optional<Movie> movie = movieDAO.findById(id);
		return movie;
	}

	@Override
	public Movie createMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieDAO.save(movie);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		movieDAO.deleteById(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		movieDAO.deleteAll();
	}

}
