package cdac;
import java.util.Scanner;

public class ProductManagement {
	
	int pn;
	Scanner sc = new Scanner(System.in);

	public int numberOfProducts() {
		System.out.print("Enter number of products: ");
		pn = sc.nextInt();
		return pn;
	}

	public Product[] getProducts() {

		Product[] p = new Product[pn];

		for (int i = 0; i < p.length; i++) {

			System.out.print("Enter Product ID: ");
			int id = sc.nextInt();

			sc.nextLine();
			System.out.print("Enter Product Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Price: ");
			double price = sc.nextDouble();

			System.out.print("Enter Quantity: ");
			int qty = sc.nextInt();

			p[i] = new Product(id, name, price, qty);
		}

		return p;
	}

	public void allProductMethods(Product[] p) {

		for (int i = 0; i < p.length; i++) {
			p[i].displayProduct();

			Product.Cart c = p[i].new Cart();
			c.calculateBill();
		}
	}

}
