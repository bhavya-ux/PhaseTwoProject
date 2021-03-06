package com.flyaway.service;

import java.util.List;

import com.flyaway.model.Flight;

public interface FlightService {
		

		public Flight createflight(Flight flight);
		public Flight  getFlightById(int id);
		public List<Flight> getAllFlights();
		public void removeFlight(int id);
		public List<Flight> getFlightSearch(String source, String destination,int passenger_count);
		public Flight updateFlight(Flight flight);

	}



