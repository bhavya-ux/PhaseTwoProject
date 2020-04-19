package com.flyaway.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class WelcomeController 
{
	@GET
	public String sayHelloGet()
	{
		return "Welcome to Flyaway Flight Services";
	}


}
