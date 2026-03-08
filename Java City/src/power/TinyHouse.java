package power;

public class TinyHouse extends Building implements PowerConsumer {

	public TinyHouse(String add) {
		super(add);
	}

	public void consumeEnergy(int watts) {		
		
		System.out.println("\nTiny House Details: ");
		System.out.println("\nAddress: " + add);
		System.out.println("Power Used: " + watts);
		System.out.println("\nPowering the lights !!");
	}

}
