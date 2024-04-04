/*Q1. Copy the Point2D class , along with the package from previous assignment.
a) Create a class "TestPointArray1.java" in "tester" package for the following
b) Accept , how many no of points to plot from user.
c) Create suitable data structure
Hint : Point2D[] points=new Point2D[sc.nextInt()];
d) Prompt user for x & y co ordinates n store the data suitably
Hint : for loop
e) Supply Menu to user with various Options like following
1. Display details of a specific point
User i/p : index
O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
2) Display x, y co-ordinates of all points
Hint : for-each
3) User i/p : 2 indices for the points , validate the indices
Display distance between specified points (iff they are not located at the same position)
eg : sop("Enter index of strt point n end point");
validation : boundary condition (0<=index<length-1)
isEqual -- false --compute distance --display it.
4. Exit*/


package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D() {
		x = 0;
		y = 0;
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String getDetails() {
		return x + "," + y;
	}
	
	public boolean isEqual(Point2D p2){
		if(this.x ==p2.x && this.y==p2.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter the x and y coordinates");
		System.out.println("Enter x-coordinate:");
		x = sc.nextInt();
		System.out.println("Enter y-coordinate:");
		y = sc.nextInt();
	}
	
	public double calculateDistance(Point2D p2) {
		double distance = Math.sqrt(((p2.x - this.x)*(p2.x - this.x))+((p2.y-this.y)*(p2.y-this.y)));
		return distance;
	}

}


