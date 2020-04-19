package com.flyaway.service.impl;

import java.util.List;

import com.flyaway.dao.FlightDAO;
import com.flyaway.dao.impl.FlightDAOImpl;
import com.flyaway.model.Flight;
import com.flyaway.service.FlightService;


public class FlightServiceImpl implements FlightService{
		private FlightDAO dao = new FlightDAOImpl();

		@Override
		public Flight createflight(Flight flight) {
			
			return dao.createflight(flight);
		}

		@Override
		public Flight getFlightById(int id) {
			return dao.getFlightById(id);
		}

		@Override
		public List<Flight> getAllFlights() {
			return dao.getAllFlights();
		}

		@Override
		public void removeFlight(int id) {
			dao.removeFlight(id);
		}

		@Override
		public List<Flight> getFlightSearch(String source, String destination,int passenger_count) {
			return dao.getFlightSearch(source, destination,passenger_count);
		

		}

		@Override
		public Flight updateFlight(Flight flight) {
			return dao.updateFlight(flight);
		}
}



