/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/

package com.sunbeam;

import java.util.Scanner;
public class Invoice {
	
	private String PNo;
	private String PDesc;
	private int quantity;
	private double price;
	private double amount=0;
	Scanner sc = new Scanner(System.in);
	
	public Invoice() {
		PNo = "0";
		PDesc = "";	
		quantity = 0;
		price = 0.0;
	}
	public Invoice(String PNo, String PDesc,int quantity,double price){
		this.PNo = PNo;
		this.PDesc = PDesc;
		this.quantity=quantity;
		this.price=price;
	}
	public String getPNo() {
		return PNo;
	}
	public String getDesc() {
		return PDesc;
	}
	public void setPNo(String PNo) {
		this.PNo = PNo;
	}
	public void setPDesc(String PDesc) {
		this.PDesc =PDesc;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setPrice(double price) {
		this.price =price;
	}
	public void setQuantity(int quantity) {
		this.quantity =quantity;
	}
	public double calculateAmt() {
		amount = quantity*price;
		return amount;
		
	}
	
	public void accept() {
		System.out.println("Enter part number:");
		PNo = sc.next();
		System.out.println("Enter description:");
		PDesc = sc.next();	
		System.out.println("Enter quantity:");
		quantity = sc.nextInt();
		if(getQuantity()<0) {
			System.out.println("Quantity is not poistive");
			setQuantity(0);
		}
		System.out.println("Enter price:");
		price = sc.nextDouble();
		if(getPrice()<0) {
			System.out.println("Price is not positive");
			setPrice(0.0);
		}
	}
//	public Invoice accept() {
//		return new Invoice(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
//	}
	public void display() {
		System.out.println("PNo : "+PNo);
		System.out.println("PDesc : "+PDesc);
		System.out.println("Quantity :"+quantity);
		System.out.println("Price :"+price);
		System.out.println("--------------");
	}
	
}
