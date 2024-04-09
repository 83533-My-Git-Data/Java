package com.sunbeam;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		System.out.println("Enter no of employees :");
		Employee[] employees = new Employee[sc.nextInt()];

		int choice;

		do {
			System.out.println("1.Salaried Employee");
			System.out.println("2.Hourly Employee");
			System.out.println("3.Commission Employee");
			System.out.println("4.Baseplus Commission Employee");
			System.out.println("5.Total Payroll");
			System.out.println("================================");

			System.out.println("Enter choice :");
			choice = sc.nextInt();

			if (choice == 1) {
				Employee e = new Salaried_Employee();
				e.acceptData(sc);
				e.calculateSalary();
				employees[counter++] = e;
				System.out.println("================================");
			}

			else if (choice == 2) {
				Employee e = new Hourly_Employee();
				e.acceptData(sc);
				e.calculateSalary();
				employees[counter++] = e;
				System.out.println("================================");
			}

			else if (choice == 3) {
				Employee e = new Commission_Employee();
				e.acceptData(sc);
				e.calculateSalary();
				employees[counter++] = e;
				System.out.println("================================");
			}

			else if (choice == 4) {
				Employee e = new BasePlusComm_Employee();
				e.acceptData(sc);
				e.calculateSalary();
				employees[counter++] = e;
				System.out.println("================================");
			} 
			
			else if (choice == 5) {
				System.out.println("Total Payroll");
				for (Employee e1 : employees) {
					if (e1 == null)
						break;
					if (e1 instanceof Salaried_Employee) {
						Salaried_Employee s;
						s = (Salaried_Employee) e1;
						s.displayData();
						s.calculateSalary();
					}
				}
				for (Employee e1 : employees) {
					if (e1 == null)
						break;
					if (e1 instanceof Hourly_Employee) {
						Hourly_Employee h;
						h = (Hourly_Employee) e1;
						h.displayData();
						h.calculateSalary();
					}
				}

				for (Employee e1 : employees) {
					if (e1 == null)
						break;
					if (e1 instanceof Commission_Employee) {
						Commission_Employee c;
						c = (Commission_Employee) e1;
						c.displayData();
						c.calculateSalary();
					}
				}

				for (Employee e1 : employees) {
					if (e1 == null)
						break;
					if (e1 instanceof BasePlusComm_Employee) {
						BasePlusComm_Employee b;
						b = (BasePlusComm_Employee) e1;
						b.displayData();
						b.calculateSalary();
					}
				}
			}
		   else
				{
					System.out.println("Invalid choice");
				}
			

		} while (choice != 0);

	}

}
