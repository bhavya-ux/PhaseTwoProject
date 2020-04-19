
package com.flyaway.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name= "Flight")
	public class Flight {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int flightId;
		private String flightCode;
		private String date;
		private double price;
		private int available_seats;
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name = "airlineId")
		private Airline airline;
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name = "routeId")
		private Route route;
		
		public int getFlightId() {
			return flightId;
		}
		public void setFlightId(int flightId) {
			this.flightId = flightId;
		}
		public String getFlightCode() {
			return flightCode;
		}
		public void setFlightCode(String flightCode) {
			this.flightCode = flightCode;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Route getRoute() {
			return route;
		}
		public void setRoute(Route route) {
			this.route = route;
		}
		public Airline getAirline() {
			return airline;
		}
		public void setAirline(Airline airline) {
			this.airline = airline;
		}
		public int getAvailable_seats() {
			return available_seats;
		}
		public void setAvailable_seats(int available_seats) {
			this.available_seats = available_seats;
		}
		
}
