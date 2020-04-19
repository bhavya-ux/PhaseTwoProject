
	package com.flyaway.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name= "trip")
	public class Trip {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int tripId;
		private String source;
		private String destination;
		private String airline;
		private double price;
		public int getTripId() {
			return tripId;
		}
		public void setTripId(int tripid) {
			tripId = tripid;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getAirline() {
			return airline;
		}
		public void setAirline(String airline) {
			this.airline = airline;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		

	}


