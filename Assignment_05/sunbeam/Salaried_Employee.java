package com.sunbeam;

import java.util.Scanner;

public class Salaried_Employee extends Employee {
	private double weekSalary;

	public Salaried_Employee(String firstName, String lastName, int sSN,double salary) {
		super(firstName,lastName,sSN);
		this.setWeekSalary(salary);
	}
    
	public Salaried_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getWeekSalary() {
		return weekSalary;
	}

	public void setWeekSalary(double weekSalary) {
		if(weekSalary>0.0) {
		    this.weekSalary = weekSalary;
		}
		else
			System.out.println("Salary should be greater than 0");
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter weekly salary :");
		weekSalary = sc.nextDouble();

	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Salary :" + weekSalary);
	}

	@Override
	public double calculateSalary() {
		double salary = getWeekSalary();
		return salary;

	}

}
