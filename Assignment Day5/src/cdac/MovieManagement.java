package cdac;

import java.util.Scanner;

public class MovieManagement {
	
	int mn;
	Scanner sc = new Scanner(System.in);

	public int numberOfMovies() {

		System.out.print("Enter number of Bookings: ");
		mn = sc.nextInt();
		return mn;
	}

	public Movie[] getMovies() {

		Movie[] m = new Movie[mn];

		for (int i = 0; i < m.length; i++) {

			sc.nextLine();
			System.out.print("Enter Movie Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Ticket Price: ");
			double price = sc.nextDouble();

			System.out.print("Enter Number Of Tickets: ");
			int tickets = sc.nextInt();

			m[i] = new Movie(name, price, tickets);
		}

		return m;
	}

	public void allMovieMethods(Movie[] m) {

		for (int i = 0; i < m.length; i++) {

			m[i].displayMovie();

			Movie.TicketBooking tb = m[i].new TicketBooking();
			tb.calculateCost();
		}
	}

}
