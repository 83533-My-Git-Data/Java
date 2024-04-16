package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Book> booklist = new HashSet<>();

		int choice;

		do {
			System.out.println("1. Accept book details and add in collection\n" + "2. Display all books from collection\n"
							+ "3. Sort the book details as per category and display it.\n"
							+ "4. Sort the book details as per author and display it.\n" + "5. Find book by id.");
			System.out.println("Enter choice :");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Exit");
				break;
			case 1:
				System.out.println("Accept book details");
				System.out.println("Unique Id(isbn):");
				String isbn = sc.next();
				System.out.println("Enter category:\n" + "0.A\n" + "1.B\n" + "2.C\n" + "3.D");
				int c = sc.nextInt();
				System.out.println("Enter price :");
				double price = sc.nextDouble();
				System.out.println("Enter Author Name:");
				String authorName = sc.next();
				System.out.println("Enter quantity :");
				int quantity = sc.nextInt();

				booklist.add(new Book(isbn, c, price, authorName, quantity));

				break;

			case 2:
				System.out.println("Display all books from collection");
				for (Book book : booklist)
					System.out.println(book);
				break;
			case 3:
				System.out.println("Sort the book details as per category:");
				class categoryComparator implements Comparator<Book> {

					@Override
					public int compare(Book o1, Book o2) {
						return o1.getC().compareTo(o2.getC());
					}
				}
				Comparator<Book> cComparator = new categoryComparator();
				List<Book> c1 = new ArrayList<>(booklist);
				Collections.sort(c1, cComparator);

				for (Book book : c1)
					System.out.println(book);

				break;

			case 4:
				System.out.println("Sort the book as per author name :");
				class authorNameComparator implements Comparator<Book> {

					@Override
					public int compare(Book o1, Book o2) {
						return o1.getAuthorName().compareTo(o2.getAuthorName());
					}
				}
				Comparator<Book> authNameComparator = new authorNameComparator();
				List<Book> b = new ArrayList<>(booklist);
				Collections.sort(b, authNameComparator);

				for (Book book : b)
					System.out.println(book);

				break;
			case 5:
				System.out.println("Enter Book id:");
				String book = sc.next();
				Book b1 = new Book();
				b1.setIsbn(book);
				for (Book element : booklist) {
					if (element.equals(b1)) {
						System.out.println("Book is present");
					} else {
						System.out.println("Book is not present");
					}
				}
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		} while (choice != 0);
	}
}