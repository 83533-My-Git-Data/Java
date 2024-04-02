/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
Hint : Check Scanner class for the methods*/

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		double n1= 0.0;
		double n2= 0.0;
		boolean flag = false;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1:");
		if(sc.hasNextDouble())
			if(sc.hasNextInt()) {
				System.out.println("Number is not double");
			}
			else {
				System.out.println("Number is double");
				n1 = sc.nextDouble();
				System.out.println("n1 :"+n1);
				flag = true;
			}
		if(flag) {
			System.out.print("Enter n2:");
			if(sc.hasNextDouble())
				if(sc.hasNextInt()) {
					System.out.println("Number is not double");
				}
				else {
					System.out.println("Number is double");
					n2 = sc.nextDouble();
					System.out.println("n2 :"+n2);	
				}		
			avg = (n1+n2)/2;
			System.out.println("Average is :"+avg);
		}
		
	}
}
