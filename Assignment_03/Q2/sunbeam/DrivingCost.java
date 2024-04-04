/*Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.*/

package com.sunbeam;

import java.util.Scanner;

public class DrivingCost {
	double totalMiles;
	double costofGasoline;
	double averageMiles;
	double parkingFees;
	double tollsPerDay;
	Scanner sc = new Scanner(System.in);
    
	public DrivingCost(double totalMiles, double costofGasoline, double averageMiles, double parkingFees,
			double tollsPerDay) {
		this.totalMiles = totalMiles;
		this.costofGasoline = costofGasoline;
		this.averageMiles = averageMiles;
		this.parkingFees = parkingFees;
		this.tollsPerDay = tollsPerDay;
	}

	public DrivingCost() {
	
	}

	public void accept() {
		System.out.println("Enter total miles driven per day:");
		totalMiles = sc.nextDouble();

		System.out.println("Enter cost per gallon of gasoline:");
		costofGasoline = sc.nextDouble();

		System.out.println("Average miles per gallon:");
		averageMiles = sc.nextDouble();

		System.out.println("Parking fees per day:");
		parkingFees = sc.nextDouble();

		System.out.println("Tolls per day:");
		tollsPerDay = sc.nextDouble();
	}

	public void display() {
		double TotalCost = ((totalMiles / averageMiles) * costofGasoline + parkingFees + tollsPerDay);
		System.out.println("Total Cost per day of driving to work: " + TotalCost);
	}
}

class D_Cost{
	public static void main(String[] args) {
		DrivingCost d = new DrivingCost();
		d.accept();
		d.display();
		
	}
}
