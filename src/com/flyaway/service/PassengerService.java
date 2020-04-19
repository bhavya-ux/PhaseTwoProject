package com.flyaway.service;

import java.util.List;

import com.flyaway.model.Passenger;

public interface PassengerService {
	
	public Passenger createPassenger(Passenger passenger);
	public List<Passenger> getPassengerById(int id);
	public List<Passenger> getAllPassengers();
	public void removePassenger(int id);


}
