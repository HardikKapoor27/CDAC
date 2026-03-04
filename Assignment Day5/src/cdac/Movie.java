package cdac;

public class Movie {
	
	String movieName;
	double ticketPrice;
	int numberOfTickets;
	double totalCost;

	public Movie(String movieName, double ticketPrice, int numberOfTickets) {

		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.numberOfTickets = numberOfTickets;
	}

	public void displayMovie() {

		System.out.println("\nMovie Name: " + movieName);
		System.out.println("Ticket Price: " + ticketPrice);
		System.out.println("Number Of Tickets: " + numberOfTickets);
	}

	class TicketBooking {

		public void calculateCost() {

			totalCost = ticketPrice * numberOfTickets;

			if (numberOfTickets > 5) {
				totalCost = totalCost - 100;
			}

			System.out.println("Total Ticket Cost: " + totalCost);
			System.out.println("----------------------------------");
		}
	}

}
