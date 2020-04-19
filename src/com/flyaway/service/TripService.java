package com.flyaway.service;

import java.util.List;

import com.flyaway.model.Trip;

public interface TripService {
	

	public Trip createtrip(Trip trip);
	public Trip getTripById(int id);
	public List<Trip> getAllTrips();
	public void removeTrip(int id);

	}

