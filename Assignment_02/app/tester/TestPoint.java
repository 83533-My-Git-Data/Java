package com.app.tester;

import com.app.geometry.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(6,5);
		Point2D p2 = new Point2D(7,4);
		p1.acceptValue();
		p2.acceptValue();
		System.out.println(p1.isEqual(p2));
		System.out.println("Distance ="+p1.calculateDistance(p2));
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
	}

}