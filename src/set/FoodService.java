package set;

import java.util.*;

public class FoodService {

	int num;
	String foodName;
	int price;
	int quantity;

	Scanner sc = new Scanner(System.in);

	HashSet<Food> food = new HashSet<Food>();

	// (id, FoodName, price, quantity, total price)
	Food food1 = new Food(1, "Plain Briyani", 100, 0, 0);
	Food food2 = new Food(2, "Chicken Briyani", 200, 0, 0);
	Food food3 = new Food(3, "Mutton Briyani", 300, 0, 0);
	Food food4 = new Food(4, "Egg Briyani", 150, 0, 0);
	Food food5 = new Food(5, "Lime Rice", 50, 0, 0);
	Food food6 = new Food(6, "Tomato Rice", 60, 0, 0);
	Food food7 = new Food(7, "Falloodaa", 70, 0, 0);
	Food food8 = new Food(8, "Muskmelon", 40, 0, 0);
	Food food9 = new Food(9, "Water Melon", 50, 0, 0);

	public FoodService() {

		food.add(food1);
		food.add(food2);
		food.add(food3);
		food.add(food4);
		food.add(food5);
		food.add(food6);
		food.add(food7);
		food.add(food8);
		food.add(food9);

	}

	ArrayList<Food> foo = new ArrayList<Food>();

	// Add Food Items
	public void add(int num) {

		for (Food item : food) {
			if (item.getNum() == num) {

				if (foo.contains(item)) {

					System.out.println("\n<-----------" + item.foodName
							+ " was already added!-----------> \nIf you want to change Quantity of Dish! Click Edit Option....");
				} else {

					System.out.println("-----You Select " + item.foodName + "-----");
					System.out.print("Enter Quantity: ");
					int quantity = sc.nextInt();
					item.quantity = quantity;

					int total = quantity * (item.price);
					item.total = total;
					foo.add(item);
					System.out.println("           Items Added successfully!!             ");
					System.out.println("<-----If You Want Add More Items ->> Click 2----->");

				}

			}
		}

	}

	// View Order

	public void view() {

		System.out.println("=============================================================\n");
		System.out.println("Id  \tName  \t\t\tPrice  \tQuantity  \tTotal\n");
		System.out.println("_____________________________________________________________\n");

		for (Food item : foo) {

			System.out.println(item);
		}

		System.out.println("==============================================================");

	}

	// Edit Order

	public void edit(int num) {

		for (Food item : foo) {

			if (item.getNum() == num) {

				System.out.println("Quantity :");
				int quantity = sc.nextInt();

				item.quantity = quantity;

				int total = quantity * (item.price);
				item.total = total;

				System.out.println("----Dish Updated successfully!!----");

			}

		}

	}

	// Delete Order

	public void delete(int num) {

		Food idDelete = null;
		for (Food item : foo) {
			if (item.getNum() == num) {
				idDelete = item;
			}
		}

		if (foo.remove(idDelete)) {

			System.out.println("<----Dish deleted successfully!!---->");

		} else {

			System.out.println("<--------Dish Not Found in the List-------->");

		}

	}

	// Generate Bill

	public void bill() {
		int overall = 0;

		System.out.println("============================================================\n");
		System.out.println("Id  \tName  \t\t\tPrice  \tQuantity  \tTotal\n");
		System.out.println("_____________________________________________________________\n");

		for (Food item : foo) {
			overall = overall + (item.total);
			System.out.println(item);
		}

		System.out.println("\n\t\t\t\tTotal Amount (Rs.) " + overall);
		double discount = overall * 2 / 100;
		System.out.println("\n\t\t\t\t    Discount (Rs.) " + discount);

		double subtotal = overall - discount;
		System.out.println("\n\t\t\t\t         Subtotal " + subtotal);

		double cgst = overall * 12 / 100;
		System.out.println("\n\t\t\t\t          GST    " + cgst + "(%)");

		System.out.println("\n\t\t      Invoice " + (subtotal + cgst));

	}

}
