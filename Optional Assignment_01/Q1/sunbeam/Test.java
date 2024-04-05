package com.sunbeam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Accept customers :");
		Scanner sc = new Scanner(System.in);
		LimitCal[] c;
		c = new LimitCal[sc.nextInt()];

		for (int i = 0; i < c.length; i++) {
			c[i] = new LimitCal();
			c[i].acceptDetails();
			c[i].displayDetails();
			c[i].newBalance();
		}
	}
}
