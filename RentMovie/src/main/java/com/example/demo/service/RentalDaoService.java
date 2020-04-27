package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.RentalDAO;
import com.example.demo.entity.Rental;
import com.example.demo.entity.User;

public class RentalDaoService implements RentalDAO {

    private RentalDAO rentalDAO;
    
    @Autowired
    public RentalDaoService(RentalDAO rentalDAO) {
    	super();
    	rentalDAO = this.rentalDAO;
    }

	@Override
	@Transactional
	public List<Rental> findAll() {
		// TODO Auto-generated method stub
		return rentalDAO.findAll();
	}

	@Override
	@Transactional
	public Optional<Rental> findById(Integer id) {
		Optional<Rental> rental = rentalDAO.findById(id);
 		return rental;
	}

	@Override
	@Transactional
	public Rental createRental(Rental rental) {
		// TODO Auto-generated method stub
		return rentalDAO.save(rental);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		rentalDAO.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() {
		// TODO Auto-generated method stub
		rentalDAO.deleteAll();
	}

}
