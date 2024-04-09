package com.sunbeam;

import java.util.Scanner;

public class BasePlusComm_Employee extends Commission_Employee{
     private double baseSalary;
     
     
  
	public BasePlusComm_Employee(String firstName, String lastName, int sSN,double baseSalary) {
		super(firstName, lastName, sSN, baseSalary, baseSalary);
		// TODO Auto-generated constructor stub
	}
	
	

	public BasePlusComm_Employee() {
		// TODO Auto-generated constructor stub
	}



	public BasePlusComm_Employee(String firstName, String lastName, int sSN, double grossSales, double commissionRate) {
		super(firstName, lastName, sSN, grossSales, commissionRate);
		// TODO Auto-generated constructor stub
	}



	public BasePlusComm_Employee(String firstName, String lastName, int sSN) {
		super(firstName, lastName, sSN);
		// TODO Auto-generated constructor stub
	}



	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter base Salary :");
		baseSalary = sc.nextInt();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Base Salary :"+baseSalary);
		
	}

	@Override
	public double calculateSalary() {
	    double salary = super.calculateSalary();
		return salary;
	}
	
	public void totalSal() {
		 double salary = (super.calculateSalary())*0.10+getBaseSalary();
		 System.out.println("Total salary :"+salary);
	}

}
