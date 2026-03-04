package cdac;

public class HotelApp {
	
	public static void main(String[] args) {

		RoomManagement rm = new RoomManagement();

		rm.numberOfRooms();
		Room[] r = rm.getRooms();
		rm.allRoomMethods(r);
	}

}
