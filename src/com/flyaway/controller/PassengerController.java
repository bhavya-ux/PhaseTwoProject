package com.flyaway.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.flyaway.model.Passenger;
import com.flyaway.service.PassengerService;
import com.flyaway.service.impl.PassengerServiceImpl;

@Path("/passenger")
public class PassengerController {
	
	private PassengerService service = new PassengerServiceImpl();
	public Passenger createPassenger(Passenger passenger)
	{
		return service.createPassenger(passenger);
	}
@GET
@Path("/{id}")
	public List<Passenger> getPassengerById(@PathParam("id") int id)
	{
		return service.getPassengerById(id);
	}
@GET
	public List<Passenger> getAllPassengers()
	{
		return service.getAllPassengers();
	}
	public void removePassenger(int id)
	{
		service.removePassenger(id);
	}
}
