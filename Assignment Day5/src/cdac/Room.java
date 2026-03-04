package cdac;

public class Room {
	
	int roomNumber;
	String roomType;
	double pricePerNight;
	int numberOfDays;
	double totalBill;

	public Room(int roomNumber, String roomType, double pricePerNight, int numberOfDays) {

		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.numberOfDays = numberOfDays;
	}

	public void displayRoom() {

		System.out.println("\nRoom Number: " + roomNumber);
		System.out.println("Room Type: " + roomType);
		System.out.println("Price Per Night: " + pricePerNight);
		System.out.println("Number Of Days: " + numberOfDays);
	}

	class Booking {

		public void calculateBill() {

			totalBill = pricePerNight * numberOfDays;

			if (numberOfDays > 5) {
				totalBill = totalBill - (totalBill * 0.20);
			}

			System.out.println("Total Room Bill: " + totalBill);
			System.out.println("----------------------------------");
		}
	}

}
