package com.flyaway.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.flyaway.dao.PassengerDAO;
import com.flyaway.model.Flight;
import com.flyaway.model.Passenger;

public class PassengerDAOImpl implements PassengerDAO {
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());
	@Override
	public Passenger createPassenger(Passenger passenger) {
		Session session= factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(passenger);
		transaction.commit();
		session.close();
		return passenger;
		
	}

	

	@Override
	public List<Passenger> getAllPassengers() 
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Passenger> passengerList = session.createQuery("from com.flyaway.model.Passenger").list();
		transaction.commit();
		session.close();
		return passengerList;
	}

	@Override
	public void removePassenger(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Passenger p = new Passenger();
		p.setPassengerId(id);
		session.delete(p);
		transaction.commit();
		session.close();		
	}



	@Override
	public List<Passenger> getPassengerById(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();	
		Query q=session.createQuery("from com.flyaway.model.Passenger p where p.passengerId = :id ");
		q.setParameter("id", id);
		List<Passenger> passengerList= q.list();
		transaction.commit();
		session.close();
		return passengerList;
	}

}