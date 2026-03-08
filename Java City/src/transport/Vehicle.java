package transport;

public class Vehicle {
	
	double speed;
	double fuel;
	
	Vehicle(double speed, double fuel) {

		this.speed = speed;
		this.fuel = fuel;
	}
	
	Vehicle(double speed) {
		
		this.speed = speed;
	}
	
	public void move() {
		System.out.println("Vehicle is moving");
	}
	
	public void soundHorn() {
		System.out.println("Ring Ring !!");
	}
	
	public void displayDetails() {
	    System.out.println("Speed: " + speed);
	}
	
}