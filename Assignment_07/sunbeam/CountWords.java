/*Q3. write a java program to count number of words in a String.
Hint: You can use , trim() , length() and split() methods*/

package com.sunbeam;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s;
    	System.out.println("Enter string :");
    	s = sc.next();
    	StringBuilder s1 = new StringBuilder(s);
    	System.out.println("Words in a String:"+s1.length());
 
    }
}
