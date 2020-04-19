package com.flyaway.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "Route")
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int routeId;
	private String source;
	private String destination;
	
	//@OneToMany(mappedBy = "route")
	//private List<Flight> flight = new ArrayList();
	
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
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
//	public List<Flight> getFlight() {
//		return flight;
//	}
//	public void setFlight(List<Flight> flight) {
//		this.flight = flight;
//	}
	
	
	
}