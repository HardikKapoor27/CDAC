package coreJava;

import java.util.Scanner;

public class Patient {
	String name;
	int pId;
	String[] Diseases;
	int NoDis;
	String Bgroup;
	float weight;
	String Doctor;
	boolean Insured;
	String res;
	
	public void PatientDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Patient Name: ");
		name = sc.nextLine();
		System.out.println();
		
		System.out.print("Patient Id: ");
		pId = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the number of Diseases: ");
		NoDis = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		Diseases = new String[NoDis];
		System.out.println("Enter the Diseases: \n");
		for(int i= 0; i< NoDis ; i++) {
			System.out.print("Disease " + (i +1 ) + ":  ");
			Diseases[i] = sc.nextLine(); 
		}
		
		System.out.println();
		System.out.print("Ënter the Blood group: ");
		Bgroup = sc.nextLine();
		
		System.out.println();
		System.out.print("Enter the Weight: ");
		weight = sc.nextFloat();
		sc.nextLine();
		
		System.out.println();
		System.out.print("Enter the Consulting Doctor Name: ");
		Doctor = sc.nextLine();
		
		System.out.println();
		System.out.print("Is patient Insured?? : ");
		Insured = sc.hasNextLine();
		
		
	}
	

	public void DisplayPatientDetails() {
		
		System.out.println();
		System.out.println("============Patient Details============");
		
		System.out.println();
		System.out.println("Patient Name: " + name );
		
		System.out.println();
		System.out.println("Patient ID: " + pId );
		
		System.out.println();
		System.out.print("Diseases: "  );
		System.out.println();
		
		for (String NoDis : Diseases) {
            System.out.println("- " + NoDis);
        }
		
		System.out.println();
		System.out.println("Blood Group: " + Bgroup);
		
		System.out.println();
		System.out.println("Weight : " + weight );
		
		System.out.println();
		System.out.println("Consulting Doctor: " + Doctor );
		
		if(Insured) {
		    res = "Yes";
		} else {
		    res = "No";
		}
		
		System.out.println();
		System.out.println("Patiend is insured: " + res);
		System.out.println();
		
	}

}
