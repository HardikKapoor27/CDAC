package cdac;

import java.util.Scanner;

public class FoodOrder {
	
	int orderId;
	String customerName;
	double price;
	double gst = price*(0.05);
	double totalBill;
	
	Scanner sc = new Scanner(System.in);
	
	public FoodOrder(int orderId, String customerName, double price, double gst, double totalBill) {
		
		this.orderId = orderId;
		this.customerName = customerName;
		this.price = price;
		this.gst = gst;
		this.totalBill = totalBill;
		
	}

	void takeInput() {
		
		System.out.println("Enter Order ID: ");
		orderId = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name: ");
		customerName = sc.nextLine();
		
		System.out.println("Enter Total Food Item Price: ");
		price = sc.nextDouble();
		
	}
	
	void calculateBill() {
		
		double totalBill = price + gst;
		System.out.println(totalBill);
	}
	
	void displayOutput() {
		
		System.out.println("Order ID: " + orderId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Total Food Item Price : " + price);
	}
	
}

class DineInOrder extends FoodOrder {
	
	double serCharge;
	
	public DineInOrder(int orderId, String customerName, double price, double gst, double totalBill, double serCharge) {
		
		super(orderId, customerName, price, gst, totalBill);
		
		this.serCharge = serCharge;
		this.takeInput();
		this.displayOutput();
		this.calculateBill();
		this.displayDineInOrder();
	}
	
	void calculateBill() {
		
		serCharge = price*(0.1);
		totalBill = price + serCharge + gst;
		
	}
	
	void displayDineInOrder() {
		
		System.out.println("Service Charge: " + serCharge);
		System.out.println("GST : " + gst);
		System.out.println("Total Bill Amount : " + totalBill );
		
	}
	
}

class TakeAwayOrder extends FoodOrder {

	public TakeAwayOrder(int orderId, String customerName, double price, double gst, double totalBill, double packCharge) {
		
		super(orderId, customerName, price, gst, totalBill);
		
		this.packCharge = packCharge;
		this.takeInput();
		this.displayOutput();
		this.calculateBill();
		this.displayTakeAwayOrder();
	}

	double packCharge;
	
	
	void calculateBill() {

		packCharge = price*(0.025);
		totalBill = price + gst + packCharge;

	}
	
	void displayTakeAwayOrder() {
	
		System.out.println("GST : " + gst);
		System.out.println("Packaging Charge: " + packCharge);
	    System.out.println("Total Bill Amount : " + totalBill);
	}
	
}

class HomeDeliveryOrder extends TakeAwayOrder {
	
	double deliveryCharge;
	
	public HomeDeliveryOrder(int orderId, String customerName, double price, double gst, double totalBill,
			double packCharge, double deliveryCharge) {
		
		super(orderId, customerName, price, gst, totalBill, packCharge);
		
		this.deliveryCharge = deliveryCharge;
		this.takeInput();
		this.displayOutput();
		this.calculateBill();
		this.displayDeliveryOrder();
	}
		
	void calculateBill() {

		deliveryCharge = price*(0.08);
		totalBill = price + gst + packCharge;

	}
	
	void displayDeliveryOrder() {
		
		System.out.println("GST : " + gst);
		System.out.println("Delivery Charge " + deliveryCharge);
	    System.out.println("Total Bill Amount : " + totalBill);
	}
	
}
