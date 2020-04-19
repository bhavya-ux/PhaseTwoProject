package com.flyaway.dao;

import com.flyaway.model.Login;

public interface LoginDAO {

	public Login createLogin(Login login);
	public boolean checkLogin(String userName, String userPassword);
	public Login updateLogin(Login login);
}
