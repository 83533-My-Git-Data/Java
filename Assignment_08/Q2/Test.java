package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class Test {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[5];
		arr[0] = new Student(3, "vrushab", "Karad", 64);
		arr[1] = new Student(1, "rahul", "Pune", 78);
		arr[2] = new Student(2, "prashant", "Nanded", 89);
		arr[3] = new Student(5, "pratik", "Kolhapur", 70);
		arr[4] = new Student(4, "onkar", "Satara", 90);

		System.out.println("Before Sorting :");
		for (Student student : arr)
			System.out.println(student);

		do {
			System.out.println("0.Exit");
			System.out.println("1.sorted on their city(asc)");
			System.out.println("2.sorted on their marks(desc)");
			System.out.println("3.sorted on their name(asc)");
			System.out.println("Enter choice :");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;
			case 1:
				System.out.println("Sorted on their city (asc):");
				class StudentCityComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.city.compareTo(o2.city);
						return value;
					}
				}
				Comparator<Student> ScityComparator = new StudentCityComparator();
				Arrays.sort(arr, ScityComparator);

				System.out.println("After Sorting(on their city) :");
				for (Student student : arr)
					System.out.println(student);
				break;

			case 2:
				System.out.println("Sorted on their marks (desc):");
				class StudentMarksComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.name.compareTo(o2.name);
						return value;
					}
				}
				Comparator<Student> SmarksComparator = new StudentMarksComparator();
				
				Arrays.sort(arr, SmarksComparator);

				System.out.println("After Sorting on their marks(desc):");
				for (Student student : arr)
					System.out.println(student);
				break;

			case 3:
				System.out.println("Sorted on their name (asc):");
				class StudentNameComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.name.compareTo(o2.name);
						return value;
					}
				}
				Comparator<Student> SnameComparator = new StudentNameComparator();
				Arrays.sort(arr, SnameComparator);

				System.out.println("After Sorting on their name(asc):");
				for (Student student : arr)
					System.out.println(student);
				break;
			default:
				System.out.println("Wrong choice");
				break;

			}
		} while (choice != 0);

	}

}
