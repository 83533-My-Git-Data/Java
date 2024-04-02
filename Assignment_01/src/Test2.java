/*3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
(No need of any class, and no need to display the food details. Only display the total of orderd
food)*/

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int choice;
		int quantity;
		int bill=0;
		do {
			System.out.println("Exit");
			System.out.println("1.Dosa");
			System.out.println("2.Samosa");
			System.out.println("3.Idli");
			System.out.println("4.Poha");	
			System.out.println("5.Generate Bill");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			switch(choice)
			{
			case 0:
				  System.out.println("...Thank you...");
				  break;
			case 1:
				  System.out.println("Enter quantity:");
				  quantity = sc.nextInt();
				  int m1 = 50;
				  bill=bill+quantity*m1;
				  break;
			case 2:
				  System.out.println("Enter quantity:");
				  quantity = sc.nextInt();
				  int m2 = 20;
				  bill=bill+quantity*m2;
				  break;
			case 3:
				  System.out.println("Enter quantity:");
				  quantity = sc.nextInt();
				  int m3 = 25;
				  bill=bill+quantity*m3;
				  break;
			case 4:
				  System.out.println("Enter quantity:");
				  quantity = sc.nextInt();
				  int m4 = 10;
				  bill=bill+quantity*m4;
				  break;
			case 5:
				  System.out.println("Total Bill:"+bill);
				  break;
			default:
				  System.out.println("Invalid choice");
				  break;		  
			}
		}while(choice!=0);	

	}
}
