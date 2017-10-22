package com.techelevator.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Review {
	private Long id;
	
	@NotBlank (message="Username is required")
	private String username;
	
	@NotNull @Min(value=0, message="Rating is required") @Max(value=5, message="Max rating of 5")
	private int rating;
	
	@NotBlank (message="Title is required")
	private String title;
	
	@NotBlank (message="Review description is required")
	private String text;
	
	private LocalDateTime dateSubmitted;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getDateSubmitted() {
		return dateSubmitted;
	}
	public void setDateSubmitted(LocalDateTime dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
	public String getFormatedDate() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
	    String formatDateTime = dateSubmitted.format(format);   
		return formatDateTime;
	}
	
}
