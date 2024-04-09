package com.app.fruits;

import java.util.Scanner;

//enum CaseMenu {
//	Exit, Mango, Orange, Apple, All_Fruits, Fresh_Fruits, Stale_Fruits
//};

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basket of size :");
		Fruits basket[] = new Fruits[sc.nextInt()];
		int counter = 0;
		int choice;
		Fruits f;
//		CaseMenu fruitChoice;

		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display all Fruits in basket");
			System.out.println("5. Display taste of all Fresh fruits");
			System.out.println("6. Mark a fruit as stale");
			System.out.println("7. Display taste of all stale fruits");
			System.out.println("8. Mark all sour fruits stale");
			System.out.println("Enter choice");
//			fruitChoice = CaseMenu.values()[sc.nextInt()];
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;
			case 1:
				f = new Mango();
				if (counter != basket.length) {
					System.out.println("Is mango fresh");

					f.setFresh(sc.nextBoolean());
					basket[counter++] = f;
					System.out.println(basket[counter - 1].getName() + "Added in Basket");
				} else {
					System.out.println("Basket is full");
				}
				break;
			case 2:
				f = new Orange();
				if (counter != basket.length) {
					System.out.println("Is orange fresh");

					f.setFresh(sc.nextBoolean());
					basket[counter++] = f;
					System.out.println(basket[counter - 1].getName() + "Added in Basket");
				} else {
					System.out.println("Basket is full");
				}
				break;
			case 3:
				f = new Apple();
				if (counter != basket.length) {
					System.out.println("Is apple fresh");

					f.setFresh(sc.nextBoolean());
					basket[counter++] = f;
					System.out.println(basket[counter - 1].getName() + "Added in Basket");
				} else {
					System.out.println("Basket is full");
				}
				break;
			case 4:
				if (counter != 0) {
					for (int i = 0; i < basket.length; i++) {
						if (basket[i] == null)
							break;

						System.out.println(basket[i].getName());
					}
				} else {
					System.out.println("Basket is empty");
				}
				break;
			case 5:
				if (counter != 0) {
					for (int i = 0; i < basket.length; i++) {
						if (basket[i] == null)
							break;

						System.out.println(basket[i].toString());
						System.out.println("Taste of" + basket[i].getName() + ":" + basket[i].taste());
					}
				}
				break;

			case 6:
				int index = 0;

				System.out.println("Enter the index no. to change");
				int count = sc.nextInt();

				if (count >= 0 && index < counter) {
					basket[count].setFresh(false);
					System.out.println(basket[count].getName());
				} else {
					System.out.println("Invalid Index!!");
				}
				break;
			case 7:
				if (counter != 0) {
					for (int i = 0; i < basket.length; i++) {
						if (basket[i] == null)
							break;

						if (!basket[i].isFresh()) {
							System.out.println("Taste of" + i + basket[i].getName() + ":" + basket[i].taste());
						}
					}
				}
				break;
			case 8:
				if (counter != 0) {
					for (int i = 0; i < basket.length; i++) {
						if (basket[i] == null)
							break;
						if (basket[i].taste().equals("sour")) {
							basket[i].setFresh(false);
						}
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
