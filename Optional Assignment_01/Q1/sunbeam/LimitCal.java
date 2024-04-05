/*Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) pending balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".
For eg -
Allowed Credit = 50000
total items charged = 25000
total all credit applied in this month = 10000
pending balance at the begining of the month = 5000
new balance for next month = 5000+25000-10000 => 20000 < Allowed Limit*/

package com.sunbeam;

import java.util.Scanner;

public class LimitCal {
	private final int accNo;
	private int p_Balance;
	private int totalOfItem;
	private int totalOfCredits;
	private int creditLimit;
	private static int generate_accno;

	static {
		generate_accno = 1000;
	}

	// object Initializer
	{
		accNo = ++generate_accno;
	}

	public LimitCal() {

	}

	public LimitCal(int p_Balance, int totalOfItem, int totalOfCredits, int creditLimit) {

		this.p_Balance = p_Balance;
		this.totalOfItem = totalOfItem;
		this.totalOfCredits = totalOfCredits;
		this.creditLimit = creditLimit;
	}

	public void acceptDetails() {
		System.out.println("***Accept Customers Details***");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pending balance :");
		p_Balance = sc.nextInt();
		System.out.println("Total of Items :");
		totalOfItem = sc.nextInt();
		System.out.println("Total of all Credits :");
		totalOfCredits = sc.nextInt();
		System.out.println("Credit Limit :");
		creditLimit = sc.nextInt();
		System.out.println("============================================");
	}

	public void newBalance() {
		double Balance = p_Balance + totalOfItem - totalOfCredits;
		if (Balance > creditLimit) {
			System.out.println("Credit Limit Exceeded!!!!");
		} else {
			System.out.println("New balance for next month=" + Balance);
		}
		System.out.println("============================================");
	}

	public void displayDetails() {
		System.out.println("***Display Customers Details***");
		System.out.println("Account No =" + accNo);
		System.out.println("Pending balance at the begining of the month =" + p_Balance);
		System.out.println("Total items charged =" + totalOfItem);
		System.out.println("Total all credit applied in this month =" + totalOfCredits);
		System.out.println("Allowed credit Limit =" + creditLimit);

	}

}
