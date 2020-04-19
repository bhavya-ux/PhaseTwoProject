package com.flyaway.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flyaway.model.Trip;
import com.flyaway.service.TripService;
import com.flyaway.service.impl.TripServiceImpl;

@Path("/trip")
public class TripController {

private TripService service = new TripServiceImpl();

/*@GET
@Path("/{name}")
public String Hello(@PathParam("name")String name)
{
	return "Ready" + name + "for your trip?";
}*/

@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Trip createtrip(Trip trip) {
	// TODO Auto-generated method stub
	return service.createtrip(trip);
}

@GET
@Path("/{id}")
public Trip getTripById(@PathParam("id")int id) {
	// TODO Auto-generated method stub
	return service.getTripById(id);
}

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Trip> getAllTrips() {
	// TODO Auto-generated method stub
	return service.getAllTrips();
}

@DELETE
public void removeTrip(@PathParam("id")int id) {
	// TODO Auto-generated method stub
	service.removeTrip(id);
	
}
	
}

