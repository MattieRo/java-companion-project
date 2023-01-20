package com.organization.mvcproject.model;

public class Review {
	
	private String body;
	private String author;
	private int customerRating;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getCustomerRating() {
		return customerRating;
	}

	public void setCustomerRating(int rating) {
		this.customerRating = rating;
	}

	public String getReviewBody() {
		return body;
	}

	public void setReviewBody(String reviewBody) {
		this.body = reviewBody;
	}
}
