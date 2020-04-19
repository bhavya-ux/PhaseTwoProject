package com.flyaway.service.impl;

import java.util.List;

import com.flyaway.dao.PassengerDAO;
import com.flyaway.dao.impl.PassengerDAOImpl;
import com.flyaway.model.Passenger;
import com.flyaway.service.PassengerService;

public class PassengerServiceImpl implements PassengerService {
	private PassengerDAO dao = new PassengerDAOImpl();
	@Override
	public Passenger createPassenger(Passenger passenger) {
		return dao.createPassenger(passenger);
	}

	

	@Override
	public List<Passenger> getAllPassengers() {
		return dao.getAllPassengers();
	}

	@Override
	public void removePassenger(int id) {
		dao.removePassenger(id);
		
	}



	@Override
	public List<Passenger> getPassengerById(int id) {
		return dao.getPassengerById(id);
	}

}
