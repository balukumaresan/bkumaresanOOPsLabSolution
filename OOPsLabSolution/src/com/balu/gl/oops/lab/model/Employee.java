package com.balu.gl.oops.lab.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String dept;
	private String email;
	private String password;

	public Employee(String firstName, String lastName, String dept) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

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
