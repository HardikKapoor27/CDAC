package cdac;

import java.util.Scanner;

public class Date {
	String day;
	String date;
	
	Scanner sc = new Scanner(System.in);
	
	public void SendDate() {
		
		System.out.print("Enter the Day: " );
		day = sc.nextLine();
		
		System.out.print("Enter The Date: ");
		date = sc.nextLine();
		
	}
	
	Date(String day, String date ){
		
		this.day = day;
		this.date = date;
		this.IssueDateDetails();
		
	}
	
	
	public void IssueDateDetails() {
		System.out.println( day + " " + date );
	}
}
