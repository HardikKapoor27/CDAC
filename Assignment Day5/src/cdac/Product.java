package cdac;

public class Product {
	
	int productId;
	String productName;
	double price;
	int quantity;
	double totalBill;

	public Product(int productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public void displayProduct() {
		System.out.println("\nProduct ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
	}

	class Cart {
		public void calculateBill() {

			totalBill = price * quantity;

			if (totalBill > 5000) {
				totalBill = totalBill - (totalBill * 0.10);
			}

			System.out.println("Total Bill: " + totalBill);
			System.out.println("--------------------------------");
		}
	}

}
