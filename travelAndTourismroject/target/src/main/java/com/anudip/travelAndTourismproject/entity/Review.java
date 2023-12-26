package com.anudip.travelAndTourismproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private Tourpackage tourPackage;

    @Column(name = "rating")
    private int rating;

    @Column(name = "comment")
    private String comment;

    @Column(name = "date")
    private Date date;

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Tourpackage getTourPackage() {
		return tourPackage;
	}

	public void setTourPackage(Tourpackage tourPackage) {
		this.tourPackage = tourPackage;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Review(Long reviewId, User customer, Tourpackage tourPackage,
			int rating, String comment, Date date) {
		super();
		this.reviewId = reviewId;
		this.customer = customer;
		this.tourPackage = tourPackage;
		this.rating = rating;
		this.comment = comment;
		this.date = date;
	}

	public Review() {
		
		// TODO Auto-generated constructor stub
	}


}
