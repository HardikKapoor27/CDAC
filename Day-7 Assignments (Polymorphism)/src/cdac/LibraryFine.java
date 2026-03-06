package cdac;

import java.util.Scanner;

public class LibraryFine {
	
	double bookprice;
    int noOfLateDays;
	
	void takeInput() {
	    
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter Book Price : ");
	    bookprice = sc.nextDouble();

	    System.out.print("Enter Late Days : ");
	    noOfLateDays = sc.nextInt();
	}
	
    void calculateFine(int lateDays) {

        double totalFine = lateDays * (bookprice * 0.05);

        System.out.println("\nFine using Late Days : " + totalFine);
    }

    void calculateFine(int lateDays, double finePerDay) {

        finePerDay = bookprice * 0.01;

        double totalFine = (lateDays * (bookprice * 0.05)) + finePerDay;

        System.out.println("\nFine Per Day : " + finePerDay);
        System.out.println("Fine using Late Days + Per Day Fine : " + totalFine);
    }

    void calculateFine(int lateDays, double finePerDay, double penalty) {

        finePerDay = bookprice * 0.01;
        penalty = bookprice * 0.02;

        double totalFine = (lateDays * (bookprice * 0.05)) + finePerDay + penalty;

        System.out.println("\nAdditional Penalty : " + penalty);
        System.out.println("Fine using Late Days + Per Day Fine + Penalty : " + totalFine);
    }

    public static void main(String[] args) {

        LibraryFine l = new LibraryFine();
        
        l.takeInput();

        double finePerDay = 0;
        double additionalPenalty = 0;

        l.calculateFine(l.noOfLateDays);
        l.calculateFine(l.noOfLateDays, finePerDay);
        l.calculateFine(l.noOfLateDays, finePerDay, additionalPenalty);

        
    }

}
