package com.flyaway.service.impl;

import com.flyaway.dao.LoginDAO;
import com.flyaway.dao.impl.LoginDAOImpl;
import com.flyaway.model.Login;
import com.flyaway.service.LoginService;

public class LoginServiceImpl implements LoginService
{

	private LoginDAO dao = new LoginDAOImpl();
	public Login createLogin(Login login)
	{
		return dao.createLogin(login);
	}
    public String checkLogin(String userName, String userPassword)
    {
		Boolean check;
		check =  dao.checkLogin(userName, userPassword) ;
    	if (check == true)
    	{
    		return "Login successful";
    	}
    	else
    	{
    		return "Login failed";
    	}

	 
}
	@Override
	public Login updateLogin(Login login) {
		return dao.updateLogin(login);
	}
}
