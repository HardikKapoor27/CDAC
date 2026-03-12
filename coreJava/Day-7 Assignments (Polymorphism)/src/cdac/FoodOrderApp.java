package cdac;

public class FoodOrderApp {

    public static void main(String[] args) {

        System.out.println("\n----- DINE IN ORDER -----");
        DineInOrder d = new DineInOrder();
        d.takeInput();
        d.calculateBill();
        d.displayOutput();
        d.displayDineInOrder();

        System.out.println("\n----- TAKE AWAY ORDER -----");
        TakeAwayOrder t = new TakeAwayOrder();
        t.takeInput();
        t.calculateBill();
        t.displayOutput();
        t.displayTakeAwayOrder();

        System.out.println("\n----- HOME DELIVERY ORDER -----");
        HomeDeliveryOrder h = new HomeDeliveryOrder();
        h.takeInput();
        h.calculateBill();
        h.displayOutput();
        h.displayDeliveryOrder();
    }
}