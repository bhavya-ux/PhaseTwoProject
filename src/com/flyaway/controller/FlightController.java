package com.flyaway.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flyaway.model.Flight;
import com.flyaway.service.FlightService;
import com.flyaway.service.impl.FlightServiceImpl;

@Path("/flight")
public class FlightController {
	private FlightService service = new FlightServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Flight createflight(Flight flight)
	{
		return service.createflight(flight);
	}
	@GET
	@Path("/{id}")
	public Flight  getFlightById(@PathParam("id")int id)
	{
		return service.getFlightById(id);
	}
	@GET
	public List<Flight> getAllFlights()
	{
		return service.getAllFlights();
	}
	@DELETE
	@Path("/{id}")
	public void removeFlight(@PathParam("id")int id)
	{
		service.removeFlight(id);
	}
	@GET
    @Path("/{source}/{destination}/{passenger_count}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getFlightSearch(@PathParam("source")String source,@PathParam("destination") String destination,@PathParam("passenger_count")int passenger_count) {
		
		return service.getFlightSearch(source,destination,passenger_count);
		
	}
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Flight updateFlight(Flight flight)
	{
		return service.updateFlight(flight);
	}
	
}
