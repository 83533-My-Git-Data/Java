package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private int SSN;

	public Employee(String firstName, String lastName, int sSN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
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

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public void acceptData(Scanner sc) {
		System.out.println("Enter first name :");
		firstName = sc.next();
		System.out.println("Enter last name :");
		lastName = sc.next();
		System.out.println("Enter social security number:");
		SSN = sc.nextInt();
	}

	public void displayData() {
		System.out.println("First name :" + firstName);
		System.out.println("Last name :" + lastName);
		System.out.println("SSN :" + SSN);
	}

	public abstract double calculateSalary();

}
