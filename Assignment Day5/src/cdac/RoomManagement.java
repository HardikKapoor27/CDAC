package cdac;
import java.util.Scanner;

public class RoomManagement {
	
	int rn;
	Scanner sc = new Scanner(System.in);

	public int numberOfRooms() {

		System.out.print("Enter number of Rooms: ");
		rn = sc.nextInt();
		return rn;
	}

	public Room[] getRooms() {

		Room[] r = new Room[rn];

		for (int i = 0; i < r.length; i++) {

			System.out.print("Enter Room Number: ");
			int number = sc.nextInt();

			sc.nextLine();
			System.out.print("Enter Room Type: ");
			String type = sc.nextLine();

			System.out.print("Enter Price Per Night: ");
			double price = sc.nextDouble();

			System.out.print("Enter Number Of Days: ");
			int days = sc.nextInt();

			r[i] = new Room(number, type, price, days);
		}

		return r;
	}

	public void allRoomMethods(Room[] r) {

		for (int i = 0; i < r.length; i++) {

			r[i].displayRoom();

			Room.Booking b = r[i].new Booking();
			b.calculateBill();
		}
	}

}
