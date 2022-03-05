package com.example.response;

import com.example.entity.Student;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentResponse {
	
private long id;
	
	@JsonProperty("First_Name")
	private String firstName;
	
	@JsonProperty("Last_Name")
	private String lastName;
	
	@JsonProperty("Email")
	private String email;
	
	public StudentResponse (Student student) {
		this.id=student.getId();
		this.firstName=student.getFirstName();
		this.lastName=student.getLastName();
		this.email=student.getEmail();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
