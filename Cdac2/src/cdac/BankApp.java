package cdac;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Account Number: " );
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Account Holder Name: ");
		String AccountHolderName = sc.nextLine();
		
		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.println();
		
		BankAccount b = new BankAccount(accountNumber,AccountHolderName,balance);
		
		int choice;
		
		do {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Exit");
			System.out.print("Enter you choice:  ");
			choice = sc.nextInt();
			
			switch(choice){
				case 1: 
						System.out.print("Enter The Amount To be Deposited: ");
				        double dep = sc.nextDouble();
				        b.Deposit(dep);
				        break;
				        
				case 2: System.out.print("Enter The Amount to be Withdrawn: ");
				 		double with = sc.nextDouble();
				 		b.WithDraw(with);
				 		break;
				 		
				case 3: 
					  System.out.println("Thank you! :) ");
					  break;
					  
				default:
					System.out.println("Invalid Choice");
					break;
					  
			} 
			
		}
		while(choice !=3); 
		sc.close();

	}

}
