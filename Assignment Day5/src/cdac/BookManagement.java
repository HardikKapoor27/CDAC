package cdac;
import java.util.Scanner;

public class BookManagement {
	
	int bn;
	Scanner sc = new Scanner(System.in);

	public int numberOfBooks() {

		System.out.print("Enter number of books: ");
		bn = sc.nextInt();
		return bn;
	}

	public Book[] getBooks() {

		Book[] b = new Book[bn];

		for (int i = 0; i < b.length; i++) {

			System.out.print("Enter Book ID: ");
			int id = sc.nextInt();

			sc.nextLine();
			System.out.print("Enter Title: ");
			String title = sc.nextLine();

			System.out.print("Enter Author: ");
			String author = sc.nextLine();

			System.out.print("Enter Price: ");
			double price = sc.nextDouble();

			b[i] = new Book(id, title, author, price);
		}

		return b;
	}

	public void allBookMethods(Book[] b) {

		for (int i = 0; i < b.length; i++) {

			b[i].displayBook();

			Book.Library l = b[i].new Library();
			l.calculatePrice();
		}
	}

}
