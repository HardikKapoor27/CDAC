package transport;

public class Car extends Vehicle {
	
	public Car(double speed, double fuel) {

		super(speed, fuel);	
		this.displayDetails();
        this.move();
        this.soundHorn();
	}

	public void move() {
		System.out.println("\nDriving at "+ speed +" km/h.");
	}

	public void soundHorn() {
		System.out.println("Beep Beep !!");
	}
	
	public void displayDetails() {
		System.out.println("\nCar Details : ");
		System.out.println("\nFuel: " + fuel + "L");
	}

}
