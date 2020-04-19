
	package com.flyaway.dao.impl;

	import java.util.List;

	import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.flyaway.dao.FlightDAO;
import com.flyaway.model.Flight;


	public class FlightDAOImpl implements FlightDAO{
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
		@Override
		public Flight createflight(Flight flight) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(flight);
			transaction.commit();
			session.close();
			return flight;
		}

		@Override
		public Flight getFlightById(int id) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Flight flight = (Flight)session.get(Flight.class,id);
			transaction.commit();
			session.close();
			return flight;
		}
		

		@Override
		public List<Flight> getAllFlights() {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			List<Flight> flightList = session.createQuery("from com.flyaway.model.Flight").list();
			transaction.commit();
			session.close();
			return flightList;
		}

		@Override
		public void removeFlight(int id) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Flight f = new Flight();
			f.setFlightId(id);
			session.delete(f);
			transaction.commit();
			session.close();		
		}
			

		@Override
		public List<Flight> getFlightSearch(String source, String destination, int passenger_count) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();	
			Query q=session.createQuery("select f.flightCode,f.date,f.price,r.source, r.destination, a.airlineName from com.flyaway.model.Flight f,com.flyaway.model.Route r,com.flyaway.model.Airline a where r.source=:source and r.destination =:destination and f.available_seats > :passenger_count");
			q.setParameter("source", source);
			q.setParameter("destination", destination);
			q.setParameter("passenger_count", passenger_count);
			List<Flight> Flightlist=q.list();
			
				
				transaction.commit();
				session.close();
				return Flightlist;
		}
		

		public Flight updateFlight(Flight flight) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.update(flight);
			transaction.commit();
			session.close();
			return flight;
		}

	}



