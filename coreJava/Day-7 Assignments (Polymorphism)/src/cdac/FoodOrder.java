package cdac;

import java.util.Scanner;

class FoodOrder {

    int orderId;
    String customerName;
    double price;
    double gst;
    double totalBill;

    Scanner sc = new Scanner(System.in);

    void takeInput() {

        System.out.println("Enter Order ID:");
        orderId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Customer Name:");
        customerName = sc.nextLine();

        System.out.println("Enter Total Food Item Price:");
        price = sc.nextDouble();
    }

    void calculateBill() {

        gst = price * 0.05;
        totalBill = price + gst;
    }

    void displayOutput() {

        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Price: " + price);
    }
}

class DineInOrder extends FoodOrder {

    double serCharge;

    void calculateBill() {

        gst = price * 0.05;
        serCharge = price * 0.10;
        totalBill = price + gst + serCharge;
    }

    void displayDineInOrder() {

        System.out.println("Service Charge: " + serCharge);
        System.out.println("GST: " + gst);
        System.out.println("Total Bill Amount: " + totalBill);
    }
}

class TakeAwayOrder extends FoodOrder {

    double packCharge;

    void calculateBill() {

        gst = price * 0.05;
        packCharge = price * 0.025;
        totalBill = price + gst + packCharge;
    }

    void displayTakeAwayOrder() {

        System.out.println("GST: " + gst);
        System.out.println("Packaging Charge: " + packCharge);
        System.out.println("Total Bill Amount: " + totalBill);
    }
}

class HomeDeliveryOrder extends TakeAwayOrder {

    double deliveryCharge;

    void calculateBill() {

        gst = price * 0.05;
        packCharge = price * 0.025;
        deliveryCharge = price * 0.08;

        totalBill = price + gst + packCharge + deliveryCharge;
    }

    void displayDeliveryOrder() {

        System.out.println("GST: " + gst);
        System.out.println("Packaging Charge: " + packCharge);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Total Bill Amount: " + totalBill);
    }
}