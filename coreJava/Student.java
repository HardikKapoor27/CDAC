package coreJava;

import java.util.Scanner;

public class Student {

    // Instance variables (each object has its own copy)
    private String name;
    private int age;
    private char grade;

    // Method to initialize student
    public void initialize() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        age = sc.nextInt();

        System.out.print("Enter Student Grade: ");
        grade = sc.next().charAt(0);

        sc.nextLine(); // clear buffer
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    // Method to update grade
    public void updateGrade(char newGrade) {
        grade = newGrade;
    }

    public static void main(String[] args) {

        Student stud1 = new Student();
        Student stud2 = new Student();

        System.out.println("Enter details for Student 1");
        stud1.initialize();

        System.out.println("\nEnter details for Student 2");
        stud2.initialize();

        System.out.println("\n--- Student Details ---");
        stud1.displayDetails();
        stud2.displayDetails();

        // Updating grade
        stud1.updateGrade('A');

        System.out.println("After updating Student 1 grade:");
        stud1.displayDetails();
    }
}