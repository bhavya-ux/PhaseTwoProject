package com.flyaway.service;

import com.flyaway.model.Login;

public interface LoginService {
	public Login createLogin(Login login);
    public String checkLogin(String userName, String userPassword);
    public Login updateLogin(Login login);
}
