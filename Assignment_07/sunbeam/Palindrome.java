/*Q2. Write a java code to check string is palindrome.*/

package com.sunbeam;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter String:");
		s = sc.next();

		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();

		if (s.equals(s1.toString())) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
