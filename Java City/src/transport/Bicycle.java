package transport;
	
public class Bicycle extends Vehicle {

	public Bicycle(double speed) {
		
		super(speed);
		this.displayDetails();
        this.move();
        this.soundHorn();
	}

	public void move() {
		System.out.println("\nPedaling at " + speed + " km/h");

	}
	
	public void displayDetails() {
	    System.out.println("\nBicycle Details : ");
	}

}
