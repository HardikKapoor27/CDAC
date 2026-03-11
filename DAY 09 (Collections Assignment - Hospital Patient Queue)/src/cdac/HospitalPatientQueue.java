package cdac;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HospitalPatientQueue {
	
	PriorityQueue<Patient> PQ = new PriorityQueue<>();
	
	public int getSeverity(String disease) {

	    switch(disease) {
	        case "Heart Attack": return 1;
	        case "Fever": return 2;
	        case "Cough": return 3;
	        case "Cold": return 4;
	        default: return 5;
	    }
	}
	 
	public void createPatient() {
		
		Patient p1 = new Patient(3,"Arun","Fever",getSeverity("Fever"));
		Patient p2 = new Patient(1,"Meena","Cold",getSeverity("Cold"));
		Patient p3 = new Patient(5,"Rahul","Heart Attack",getSeverity("Heart Attack"));
		Patient p4 = new Patient(2,"Priya","Fever",getSeverity("Fever"));
		Patient p5 = new Patient(4,"Kiran","Allergy",getSeverity("Ällergy"));
		Patient p6 = new Patient(6,"Virat","Cough",getSeverity("Cough"));

		PQ.add(p1);
		PQ.add(p2);
		PQ.add(p3);
		PQ.add(p4);
		PQ.add(p5);
		PQ.add(p6);
		
		System.out.println();
		displayPatient();
	}
	
	public void displayPatient() {
		
		if(PQ.isEmpty()) {
	        System.out.println("\n!! No patients in queue");
	        return;
	    }
		
		System.out.println("Patient ID  ||  Patient Name   ||   Disease");
		System.out.println("============================================");
		
		for(Patient obj : PQ) {
			obj.patientDisplay();
		}
	}
	
	public void addPatient() {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Patient Id: ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Patient Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Disease: ");
		String disease = sc.nextLine();

		int severity = getSeverity(disease);

		Patient p = new Patient(id, name, disease, severity);

		PQ.add(p);

		System.out.println("\nPatient Added Successfully !!\n");
		
		}
	
	public void sortPatientsPriority() {
		
		if(PQ.isEmpty()) {
	        System.out.println("\n!! No patients in queue");
	        return;
	    }
		
		System.out.println("\nPatient Sorted Based On Disease Severity =====>\n");
		System.out.println("Patient ID  ||  Patient Name   ||   Disease");
	    System.out.println("==============================================");
		
		PriorityQueue<Patient> temp = new PriorityQueue<>(PQ);

	    while(!temp.isEmpty()) {
	        Patient p = temp.poll();
	        p.patientDisplay();
	    }
	}
	
	public void servePatients() {
		
		if(PQ.isEmpty()) {
	        System.out.println("\n!! No patients in queue");
	        return;
	    }
		
		Patient Served = PQ.remove();
		
		System.out.println("\nServing Patient : \n");
		System.out.println("Patient ID  ||  Patient Name   ||   Disease");
		System.out.println("===============================================");
		Served.patientDisplay();
		
	}
	
	public void nextPatient() {

		if(PQ.isEmpty()) {
			System.out.println("\n!! No patients in queue");
			return;
		}

		Patient Served = PQ.peek();

		System.out.println("\nNext Patient : \n");
		System.out.println("Patient ID  ||  Patient Name   ||   Disease");
		System.out.println("==============================================");
		Served.patientDisplay();

	}
   
}
