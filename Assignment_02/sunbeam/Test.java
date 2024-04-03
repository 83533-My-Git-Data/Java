package com.sunbeam;

public class Test {
		public static void main(String[] args) {
			Invoice I1 = new Invoice();
			Invoice I2 = new Invoice();
			I1.accept();
			I1.display();	
			System.out.println("Invoice Amount:"+I1.calculateAmt());
		}
	}


