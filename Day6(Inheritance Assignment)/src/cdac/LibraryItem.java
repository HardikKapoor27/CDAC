package cdac;

import java.util.Scanner;

public class LibraryItem {
	
	Scanner  sc = new Scanner(System.in);
	
	int itemId;
	String title;
	int numberPage;
	String genre;
	double price;
	double fine;
	int issueNum;
	Date d;
	
	public  void TakeInput() {
			
		System.out.print("\nEnter Item ID: ");
		itemId = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Title: ");
		title = sc.nextLine();
		
		System.out.print("Enter No. of page: ");
		numberPage = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Genre: ");
		genre = sc.nextLine();
		
		System.out.print("Enter the Price: ");
		price = sc.nextDouble();
		
		System.out.print("Enter the Issue Number: ");
		issueNum = sc.nextInt();
		
	}
	
	public LibraryItem(int itemId, String title, int numberPage, String genre, double price,
			int issueNum , Date d) {
		
		this.itemId = itemId;
		this.title = title;
		this.numberPage = numberPage;
		this.genre = genre;
		this.price = price;
		this.issueNum = issueNum;
	}

	public void DisplayLibItem() {
		
		System.out.println("\nItem ID: " + itemId );
		System.out.println("Title: " + title );
		System.out.println("Issue Number: "  + issueNum);
		System.out.println("Number of pages: " + numberPage );
		System.out.println("Genre: " + genre );
		System.out.println("Price: " +  price );
		System.out.println("Fine: " + fine );
		System.out.println("Issue Number: " + issueNum);
	}
	
	public void fineCal() {
		fine = price *(0.5);
	}
	
	
}

class Book extends LibraryItem {
	
	String Author;
	
	public Book(int itemId, String title, int numberPage, String genre, double price, int issueNum, Date d,
			String author) {
		
		super(itemId, title, numberPage, genre, price, issueNum, d);
		
		this.Author = author;
		
		this.TakeInput();
		this.takeAutorInput();
		this.fineCal();
		this.DisplayLibItem();
		this.displayAuthor();
		
	}

	public void takeAutorInput() {
		
		sc.nextLine();
		System.out.print("Enter Author name: ");
		Author = sc.nextLine();
	}
	
	public void displayAuthor() {
		
		System.out.print("Author of the Book: " + Author);
	}
	
}

 class Magazine extends LibraryItem {
	 
	 
	public Magazine(int itemId, String title, int numberPage, String genre, double price, int issueNum,
			Date d) {
		super(itemId, title, numberPage, genre, price, issueNum, d);
		
		this.TakeInput();
		this.fineCal();
		this.DisplayLibItem();
	}

 }