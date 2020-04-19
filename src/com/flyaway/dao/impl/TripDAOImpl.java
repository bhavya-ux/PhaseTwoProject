package com.flyaway.dao.impl;

import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.flyaway.dao.TripDAO;
import com.flyaway.model.Trip;

public class TripDAOImpl implements TripDAO{
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());
	
	@Override
	public Trip createtrip(Trip trip) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(trip);
		transaction.commit();
		session.close();
		return trip;
	}

	@Override
	public Trip getTripById(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Trip trip = (Trip)session.get(Trip.class,id);
		transaction.commit();
		session.close();
		return trip;
	}

	@Override
	public List<Trip> getAllTrips() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Trip> tripList = session.createQuery("from com.flyaway.model.Trip").list();
		transaction.commit();
		session.close();
		return tripList;
	}

	@Override
	public void removeTrip(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Trip t = new Trip();
		t.setTripId(id);
		session.delete(t);
		transaction.commit();
		session.close();		
	}

}
