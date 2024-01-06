package set;

public class Food {

	public int num;
	public String foodName;
	public int price;
	public int quantity;
	public int total;

	public Food(int num, String foodName, int price, int quantity, int total) {

		this.num = num;
		this.foodName = foodName;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
	}

	// Getters

	public int getNum() {
		return num;
	}

	public String getFoodName() {
		return foodName;
	}

	public int getPrice() {
		return price;
	}

	// Setters

	public void setNum(int num) {
		this.num = num;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String toString() {
		return (num + "\t" + foodName + "\t\t" + price + "\t" + quantity + "\t\t" + total +"\n");
	}


}
