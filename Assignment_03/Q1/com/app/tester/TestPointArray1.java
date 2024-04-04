package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		System.out.println("Accept no of points:");
		Scanner sc = new Scanner(System.in);
		Point2D[] points;
		points = new Point2D[sc.nextInt()];
		
		for(int i = 0;i<points.length;i++) {
			points[i] = new Point2D();
			points[i].accept();	
		}
		
		int choice;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Display Details of a specific point");
			System.out.println("2.Display x and y coordinate for all points:");
			System.out.println("3.Display distance between two points");
			System.out.println("Enter choice :");
			choice = sc.nextInt();

			
			switch(choice)
			{
			  case 0 :
				  System.out.println("Exit!!");
				  System.out.println("------------");
				  break;
				  
			  case 1 : {
				  int index;
				  System.out.println("Enter index :");
				  index = sc.nextInt();
				  if(index>0 && index<points.length) 
				  {
					  System.out.println("Valid Index");
					  System.out.println("Display details :"+points[index].getDetails());
				  }
				else { 
						  System.out.println("Invalid Index");
					  
				  }
				  }
				  break;
			  case 2:
				   System.out.println("Display x and y coordinate for all points:");
				   for(Point2D element : points)
				   System.out.println("Coordinates of all points:"+element.getDetails());
				   break;	
			  case 3:
				  int i1;
				  int i2;
				  System.out.println("Enter index i1:");
				  i1 = sc.nextInt();
				  System.out.println("Enter index i2:");
				  i2 = sc.nextInt();
				  if(i1 < 0 && i1 >= points.length)
					  System.out.println("Index i1 is invalid");
				  if(i2 < 0 && i2 >= points.length) {
					  System.out.println("Index i2 is invalid");
				  }
				  
				  if(points[i1].isEqual(points[i2])) {
					  System.out.println("points are at same location");
				  }
				  else {
					  System.out.println("Points are at different location");
					  System.out.println("Coordinates at i1:"+points[i1].getDetails());
					  System.out.println("Coordinates at i2:"+points[i2].getDetails());
					  
					  System.out.println("Distance ="+points[i1].calculateDistance(points[i2]));
				  }
				  break;
			   default:
				   System.out.println("Invalid choice");
				  break;
		}
      
	}while(choice!=0);
	}
}

