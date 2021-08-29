package com.balu.gl.oops.lab.credential;

import java.util.Random;

import com.balu.gl.oops.lab.model.Employee;

public class CredentialService {

	private static String companyName = "abc.com";
	private Employee employee;

	public CredentialService(Employee employee) {

		this.employee = employee;
	}

	public void generateEmailAddress() {
		employee.setEmail(
				employee.getFirstName() + employee.getLastName() + "." + employee.getDept() + "@" + companyName);
	}

	public void generatePassword() {

		StringBuilder sb = new StringBuilder();
		sb.append(randomAlphaGenerator(1).toUpperCase());
		
		double d = Math.random() * 1000;
		sb.append((int) d);
		String splCha = "@%$*!?^@%$*!^@%$*!^?@%$*!^?";
		double d1 = Math.random() * 10;
		sb.append(splCha.charAt((int)d1));
		sb.append(randomAlphaGenerator(4).toLowerCase());
		this.employee.setPassword(sb.toString());

	}

	public void showCredentials() {
		System.out.println("Dear " + employee.getFirstName() + "your generated credentials are as follows");
		System.out.println("Email ---> " + employee.getEmail());
		System.out.println("Password ---> " + employee.getPassword());
	}

	public void setPassword(String password) {
		this.employee.setPassword(password);
	}

	private String randomAlphaGenerator(int size) {
		String charecters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			int index = random.nextInt(charecters.length());
			sb.append(charecters.charAt(index));
		}
		return sb.toString();
	}
	

}
