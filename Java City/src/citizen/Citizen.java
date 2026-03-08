package citizen;

import java.util.Scanner;

public class Citizen {
	
	private String name;
	private int age;
	private int voterId;
	private String password;
	private int uniqueId;
	
	private static int citizenCount = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public Citizen(String name, int age, int voterId, String password) {
		
		this.name = name;
		this.age = age;
		this.voterId = voterId;
		this.password = password;
		
		citizenCount++;
		this.uniqueId = citizenCount;
		
		this.citizenDisplay();
		this.updateAge();
		this.updatePassword();
        
	}

	public void updatePassword() {
		
		System.out.print("\nDo you want to update password? (1-Yes / 2-No): ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.print("\nEnter old password: ");
			String oldPass = sc.next();

			System.out.print("Enter new password: ");
			String newPass = sc.next();

			if(password.equals(oldPass)) {
				password = newPass;
				System.out.println("\nPassword Updated Successfully !!");
			}
			else {
				System.out.println("\nOld password is incorrect !!");
			}
		}
		else {
			System.out.println("\nPassword not updated.");
		}
	}

	public void updateAge() {
		
		System.out.print("\nDo you want to update age? (1-Yes / 2-No): ");
		int choice = sc.nextInt();
		
		if(choice == 1)
		{		
				System.out.print("\nEnter new age: ");
			    int newAge = sc.nextInt();

			    if(newAge <= 0) {
			        System.out.println("\nAge cannot be less than or equal to zero !!");
			    }
			    else {
			        age = newAge;
			        System.out.println("\nAge updated successfully !!");
			    }
		}
		else {
			System.out.println("\nAge not updated.");
		}
		
	}
	
	public void citizenDisplay() {
		
		System.out.println("\nCitizen Details : ");
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Unique ID: " + uniqueId);
		System.out.println("VoterId: " + voterId);
	}

}
