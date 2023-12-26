package com.anudip.travelAndTourismproject.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private Tourpackage tourpackage;

    @Column(name = "booking_date")
    private Date bookingDate;

    @Column(name = "status")
    private String status;

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Tourpackage getTourpackage() {
		return tourpackage;
	}

	public void setTourpackage(Tourpackage tourpackage) {
		this.tourpackage = tourpackage;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Booking(Long bookingId, User customer, Tourpackage tourpackage, Date bookingDate, String status) {
		super();
		this.bookingId = bookingId;
		this.customer = customer;
		this.tourpackage = tourpackage;
		this.bookingDate = bookingDate;
		this.status = status;
	}

	public Booking() {
		
		// TODO Auto-generated constructor stub
	}

}

