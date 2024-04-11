/*Q1. Write a java program to reverse a String*/

package com.sunbeam;

import java.util.Scanner;

public class Reverse {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String s;
	   System.out.println("Enter string :");
	   s = sc.next();
	   StringBuilder s1 = new StringBuilder(s);
	   System.out.println("Reverse String:"+s1.reverse());
   }
}
