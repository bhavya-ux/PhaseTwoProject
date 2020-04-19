package com.flyaway.service.impl;

import java.util.List;

import com.flyaway.dao.TripDAO;
import com.flyaway.dao.impl.TripDAOImpl;
import com.flyaway.model.Trip;
import com.flyaway.service.TripService;

public class TripServiceImpl implements TripService{
private TripDAO dao = new TripDAOImpl();
	@Override
	public Trip createtrip(Trip trip) {
		// TODO Auto-generated method stub
		return dao.createtrip(trip);
	}

	@Override
	public Trip getTripById(int id) {
		// TODO Auto-generated method stub
		return dao.getTripById(id);
	}

	@Override
	public List<Trip> getAllTrips() {
		// TODO Auto-generated method stub
		return dao.getAllTrips();
	}

	@Override
	public void removeTrip(int id) {
		// TODO Auto-generated method stub
		dao.removeTrip(id);
		
	}
	

}
