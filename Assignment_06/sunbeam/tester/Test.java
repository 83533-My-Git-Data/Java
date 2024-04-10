package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.Program;
import com.sunbeam.Exceptions.ExceptionLineTooLong;

public class Test {
   public static void main(String[] args) {
	   Program p = new Program();
	   Scanner sc = new Scanner(System.in);
	   try {
		    System.out.println("Enter string :");
		    p.setName(sc.next());
	   }catch(ExceptionLineTooLong e) {
		   e.printStackTrace();   
	   }
	
	   System.out.println("Program executed successfully");
   }
}
