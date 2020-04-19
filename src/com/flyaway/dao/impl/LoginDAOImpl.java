package com.flyaway.dao.impl;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.flyaway.dao.LoginDAO;
import com.flyaway.model.Flight;
import com.flyaway.model.Login;

public class LoginDAOImpl implements LoginDAO{
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());

	public Login createLogin(Login login) {
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	session.save(login);
	transaction.commit();
	session.close();
	return login;
	}
		
	@Override
	public boolean checkLogin(String userName, String userPassword) {
		Session session = factory.openSession();
		boolean userFound = false;
		//String SQL_QUERY ="from com.model.flyway.Login l where l.userName = :userName and l.userPassword = :userPasword";
		Query query = session.createQuery("from Login l where l.userName = ? and l.userPassword = ?");
		query.setParameter(0,userName);
		query.setParameter(1,userPassword);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;   		
	}
	
	public Login updateLogin(Login login) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(login);
		transaction.commit();
		session.close();
		return login;
	}

	

}
