package com.flyaway.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flyaway.model.Passenger;
import com.flyaway.service.PassengerService;
import com.flyaway.service.impl.PassengerServiceImpl;

@Path("/passenger")
public class PassengerController {
	
	private PassengerService service = new PassengerServiceImpl();
	@POST
	@Path("/details")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
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
