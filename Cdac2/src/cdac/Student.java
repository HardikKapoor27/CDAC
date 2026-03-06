package cdac;

import java.util.Scanner;

public class Student {
	
	    int id;
	    String name;
	    String[] courses;
	    String[] subjects;
	    float[] marks;
	    char[] grades;

	    public void getStudentData() {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("\n========== Enter Student Details ==========\n");

	        System.out.print("Enter ID: ");
	        id = sc.nextInt();
	        sc.nextLine();

	        System.out.println();
	        System.out.print("Enter Name: ");
	        name = sc.nextLine();

	        System.out.println();
	        System.out.print("Enter number of courses: ");
	        int c = sc.nextInt();
	        sc.nextLine();

	        courses = new String[c];
	        System.out.println();
	        System.out.println("Enter course names:\n");
	        for (int i = 0; i < c; i++) {
	            System.out.print("Course " + (i + 1) + ": ");
	            courses[i] = sc.nextLine();
	        }

	        System.out.println();
	        System.out.print("Enter number of subjects: ");
	        int s = sc.nextInt();
	        sc.nextLine();

	        subjects = new String[s];
	        marks = new float[s];
	        grades = new char[s];

	        System.out.println();
	        System.out.println("Enter subject details:\n");

	        for (int i = 0; i < s; i++) {
	            System.out.print("Subject " + (i + 1) + " name: ");
	            subjects[i] = sc.nextLine();

	            System.out.print("Marks: ");
	            marks[i] = sc.nextFloat();

	            System.out.print("Grade: ");
	            grades[i] = sc.next().charAt(0);
	            sc.nextLine();

	            System.out.println();
	        }
	    }

	    public void displayStudentData() {

	        System.out.println("\n========== Student Data ==========\n");
	        System.out.println("ID   : " + id);
	        System.out.println("Name : " + name);

	        System.out.println("\nCourses:");
	        for (String c : courses) {
	            System.out.println("- " + c);
	        }

	        System.out.println("\nSubjects   Marks   Grade");
	        System.out.println("-------------------------");
	        for (int i = 0; i < subjects.length; i++) {
	            System.out.println(subjects[i] + "   " + marks[i] + "   " + grades[i]);
	        }
	    }

}
