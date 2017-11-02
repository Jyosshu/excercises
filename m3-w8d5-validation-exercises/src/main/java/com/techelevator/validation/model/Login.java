package com.techelevator.validation.model;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class Login {
	
	@NotBlank (message="Email address is required") @Email (message="Please enter a valid email address")
	private String email;
	
	@NotBlank (message="password is required") 
	@Length(min=4, max=8, message="Password should be between 4 - 8 charactes")
	//@Pattern(regexp = "[a-zA-Z0-9 ]", message="password requires alpha numeric (a-z,A-Z or 0-9)")
	private String password;
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
