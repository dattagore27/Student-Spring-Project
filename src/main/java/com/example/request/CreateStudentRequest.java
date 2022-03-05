package com.example.request;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateStudentRequest {

	@JsonProperty("First_Name")
	@NotBlank(message="First Name is not Valid")
	private String firstName;
	
	@JsonProperty("Last_Name")
	@NotBlank(message="Last Name is not Valid")
	private String lastName;
	
	@JsonProperty("Email")
	@NotBlank(message="Email is not Valid")
	private String email;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
