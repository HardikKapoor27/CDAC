package cdac;

public class Book {
	
	int bookId;
	String title;
	String author;
	double price;
	double finalPrice;

	public Book(int bookId, String title, String author, double price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void displayBook() {
		System.out.println("\nBook ID: " + bookId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}

	class Library {

		public void calculatePrice() {

			finalPrice = price;

			if (price > 1000) {
				finalPrice = price - (price * 0.15);
			}

			System.out.println("Final Price: " + finalPrice);
			System.out.println("--------------------------------");
		}
	}

}