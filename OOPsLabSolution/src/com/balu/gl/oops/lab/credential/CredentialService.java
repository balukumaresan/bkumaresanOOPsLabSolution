package com.balu.gl.oops.lab.credential;

import java.util.Random;

import com.balu.gl.oops.lab.model.Employee;

public class CredentialService {

	public String generateEmailAddress(Employee employee, String dept) {
		return employee.getFirstName() + employee.getLastName() + "@" + dept + ".abc.com";
	}

	public char[] generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String splChar = "!@#$%^&*_=+/?<>";
		String pwGenString = caps + lower + splChar;

		char[] pwchar = new char[8];
		Random random = new Random();

		for (int i = 0; i < pwchar.length; i++) {
			pwchar[i] = pwGenString.charAt(random.nextInt(pwGenString.length()));
		}
		System.out.println(pwchar);
		return pwchar;
	}

	public void showCredentials(Employee employee, String email, char []  password) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ---> " + email);
		System.out.println("Password ---> " + password.toString());
	}
}
