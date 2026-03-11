package cdac;

import java.util.Scanner;

public class PatientQueueTest {
	
	public static void main(String[] args) {
		
		HospitalPatientQueue hpq = new HospitalPatientQueue();
		
		Scanner sc = new Scanner(System.in);
		int c;
		
		do {
			System.out.println("\n<========Patient Management Menu========>");
			System.out.println("\n1. Add New Patient");
			System.out.println("2. Serve Patient");
			System.out.println("3. Display Next Patient");
			System.out.println("4. Display All Patient");
			System.out.println("5. Sort Patients By Disease Priority");
			System.out.println("6. Get PreAdded Patients");
			System.out.println("7. Exit Patient Management");
			
			System.out.print("\nEnter Your Choice: ");
			
			c = sc.nextInt();
			
			switch(c) {
			 
			case 1:
				hpq.addPatient();
				break;
			case 2:
				hpq.servePatients();
				break;
			case 3:
				hpq.nextPatient();
				break;
			case 4:
				hpq.displayPatient();
				break;
			case 5:
				hpq.sortPatientsPriority();
				break;
			case 6:
				hpq.createPatient();
				break;
			case 7:
				System.out.println("\nExiting Patient Management !!");
			default:
				System.out.println("\nInvalid Choice");
			}
			
		}while(c != 7);
		sc.close();
			
	}

}
