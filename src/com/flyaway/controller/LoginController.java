package com.flyaway.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flyaway.model.Login;
import com.flyaway.service.LoginService;
import com.flyaway.service.impl.LoginServiceImpl;

@Path("/login")
public class LoginController {
	
	private LoginService service = new LoginServiceImpl();
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Login createLogin(Login login)
	{
		return service.createLogin(login);
	}
	@GET
	@Path("/{userName}/{userPassword}")
    public String checkLogin(@PathParam("userName")String userName, @PathParam("userPassword")String userPassword) {
    	return service.checkLogin(userName, userPassword);
    }
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Login updateLogin(Login login)
	{
		return service.updateLogin(login);
	}
}

