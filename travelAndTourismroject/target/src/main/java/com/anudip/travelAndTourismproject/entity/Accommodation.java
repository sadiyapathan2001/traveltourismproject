package com.anudip.travelAndTourismproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "accommodations")
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accommodation_id")
    
    private Long accommodationId;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type; // Assuming type is a String (hotel, resort)

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "availability")
    private int availability;

	public Long getAccommodationId() {
		return accommodationId;
	}

	public void setAccommodationId(Long accommodationId) {
		this.accommodationId = accommodationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Accommodation(Long accommodationId, String name, String type, int capacity, int availability) {
		super();
		this.accommodationId = accommodationId;
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.availability = availability;
	}

	public Accommodation() {
		
		// TODO Auto-generated constructor stub
	}


    
}









