package com.organization.mvcproject.MGLTask1.model;

public class Review {
	
	/**
	 * TODO 1.0 java object member variable naming convention,
	 * one member declared here is not object oriented refactor it
	 */
	private String reviewBody;
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
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}
}
