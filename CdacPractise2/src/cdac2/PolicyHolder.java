package coreJava;

import java.util.Scanner;

public class PolicyHolder {
	
	Scanner sc = new Scanner(System.in);
	
	int policyNumber;
	String name;
	int age;
	double sumAssured;
	double TotalSumAssured;
	
	public PolicyHolder(int policyNumber,String name, int age,double sumAssured) {
		
		this.policyNumber = policyNumber;
		this.name = name;
		this.age = age;
		this.sumAssured = sumAssured; 
	}
	
	public void displayPolicyHolder() {
		
		System.out.print("\nPolicyHolder Details -------------> \n");
		System.out.println("\nPolicy Number: " + policyNumber);
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Sum Assured: " + sumAssured);
	}
		
	public void PremiumAmt() {
			
			if(age <= 30) {
				TotalSumAssured = sumAssured*(0.02);
			}
			else if(age > 30 && age <= 50) {
				TotalSumAssured = sumAssured + sumAssured*(0.03);
			} else {
				TotalSumAssured = sumAssured + sumAssured*(0.05);
			}
			
			System.out.println("\nSo the Total Assured Amount is: " + TotalSumAssured);
			System.out.println("------------------------------------------------------------>");
			
			
		}
	
}
