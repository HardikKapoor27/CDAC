package coreJava;

import java.util.Scanner;

public class Employee {
	int empID;
	String Name;
	double baseSalary;
	
	Employee(){
		
		this.GetEmployeeDetails(); 
		this.DisplayEmployeeDetails();
		this.SalaryCalculator();
	}
	
	public static void createEmployees() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Employee " + (i + 1) + " ---");
            new Employee(); 
        }

        System.out.println("\nAll employees have been created and displayed automatically!");
    }
	
	public void GetEmployeeDetails() {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id: ");
		empID = sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		Name = sc.next();
		
		System.out.println("Enter Employee Base Salary : ");
		baseSalary = sc.nextDouble();
	}

	public void DisplayEmployeeDetails() {
		
		System.out.println();
		System.out.println("Employee ID: " + empID );
		System.out.println("Employee Name: " + Name );
		System.out.println("Employee Base Salary: " + baseSalary);
	}
	
	public void SalaryCalculator() {
		
		double HRA = baseSalary * (0.2);
		double DA = baseSalary * (0.1);
		double finalSalary = baseSalary + HRA + DA;
		
		System.out.println();
		System.out.println("HRA is: " + HRA );
		System.out.println("DA is: " + DA );
		System.out.println("Final Salary is: " + finalSalary );
	}
}
