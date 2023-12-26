package com.anudip.travelAndTourismproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "transportaons")
public class Transportation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transportation_id")
    private Long transportationId;

    @Column(name = "type")
    private String type; // Assuming type is a String (bus, flight)

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "availability")
    private int availability;

	public Long getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(Long transportationId) {
		this.transportationId = transportationId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public Transportation(Long transportationId, String type, int capacity, int availability) {
		super();
		this.transportationId = transportationId;
		this.type = type;
		this.capacity = capacity;
		this.availability = availability;
	}

	public Transportation() {
		
		// TODO Auto-generated constructor stub
	}


}