package com.sunbeam;

import java.util.Scanner;

public class Commission_Employee extends Employee {
    private double grossSales;
    private double commissionRate=0.10;
    
	
	public Commission_Employee(String firstName, String lastName, int sSN, double grossSales,double commissionRate) {
		super(firstName,lastName,sSN);
		this.setCommissionRate(commissionRate);
		this.setGrossSales(grossSales);
	}
	
	public Commission_Employee() {
		// TODO Auto-generated constructor stub
	}

	public Commission_Employee(String firstName, String lastName, int sSN) {
		super(firstName, lastName, sSN);
		// TODO Auto-generated constructor stub
	}

	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Gross sales :");
		grossSales = sc.nextDouble();
		
	}
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Gross sales :"+grossSales);
		System.out.println("Commission Rate :"+getCommissionRate());
	}
	
	@Override
	public double calculateSalary() {
		double salary = commissionRate*getGrossSales();
		return salary;
		
	}
    
    
	
    
}
