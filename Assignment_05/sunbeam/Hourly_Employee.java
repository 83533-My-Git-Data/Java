package com.sunbeam;

import java.util.Scanner;

public class Hourly_Employee extends Employee {
	private int Wage;
	private int hrs;

	public Hourly_Employee(String firstName, String lastName, int sSN, int Wage, int hrs) {
		super(firstName, lastName, sSN);
		this.setWage(Wage);
		this.setHrs(hrs);

	}

	public Hourly_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWage() {
		return Wage;
	}

	public void setWage(int wage) {
		Wage = wage;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter hourly wage :");
		Wage = sc.nextInt();
		System.out.println("Hours Worked :");
		hrs = sc.nextInt();

	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Hourly wage :" + Wage);
		System.out.println("Hours worked :" + hrs);
	}

	@Override
	public double calculateSalary() {
		double salary = 0.0;
		if (getHrs() <= 40) {
			salary = getWage() * getHrs();
			return salary;

		} else if (getHrs() > 40) {
			salary = (40 * getWage() + (getHrs() - 40) * getWage() * 1.5);
			return salary;
		}
		return salary;
	}

}
