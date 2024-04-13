/*Q2. Use Arrays.sort() to sort array of Students using Comparator. Write a menu driven code to
display students
1. sorted on their city (asc)
2. sorted on their on marks (desc)
3. sorted on their on name (asc)*/

package com.sunbeam;

public class Student {
	String name;
	String city;
	int rollno;
	double marks;

	public Student() {

	}

	public Student(int rollno, String name, String city, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + rollno + ",Name =" + name + ",City=" + city + ",marks="+marks+"]";
	}

	
}
