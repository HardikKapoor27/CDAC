package power;

public class ShoppingMall extends Building implements PowerConsumer {

	public ShoppingMall(String add) {
		super(add);
	}

	public void consumeEnergy(int watts) {
		
		System.out.println("\nShopping Mall Details: ");
		System.out.println("\nAddress: " + add);
		System.out.println("Power Used: " + watts);
		
		if(watts > 1000) {
			System.out.println("\nHigh usage warning !!");
		}
		else {
			System.out.println("\nPowering the lights...");
		}
	}

}
