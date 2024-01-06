package set;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;

		FoodService food = new FoodService();

		System.out.println("*****************Welcome To our Restaurant*****************");
		System.out.println("===========================================================");

		do {
			System.out.println("===========================================================");

			System.out.println("1. Show Menu Card");
			System.out.println("2. Add Items");
			System.out.println("3. View My Order");
			System.out.println("4. Edit Order");
			System.out.println("5. Remove Selected Order");
			System.out.println("6. Generate Bill");
			System.out.println("7. Exit");

			System.out.println("===========================================================");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				DisplayMenu.mainMenu();
				break;

			case 2:
				System.out.print("Enter ID: ");
				int num = sc.nextInt();
				food.add(num);
				break;

			case 3:
				food.view();
				break;

			case 4:
				System.out.print("Enter ID: ");
				num = sc.nextInt();

				food.edit(num);

				break;

			case 5:
				System.out.println("Enter the Dish Id :");
				num = sc.nextInt();
				food.delete(num);
				
				break;

			case 6:
				food.bill();
				System.out.println("============================================================\n");

				break;

			case 7:
				System.out.println("\t\t----------------Thank You for Shopping!!-----------------");
				System.out.println("\t\t                     Visit Again");

				break;

			default:
				System.out.println("Invalid choice Please try again ........");
				System.out.println("====================================================================");
				break;

			}
		} while (choice != 7);
	}

}
