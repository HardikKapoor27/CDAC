package cdac2;

import java.util.Scanner;

public class StudentMain {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();

	        Student[] students = new Student[n];

	        for (int i = 0; i < n; i++) {
	            students[i] = new Student();
	            students[i].getStudentData(sc);
	        }

	        System.out.println("\n\n=========== ALL STUDENTS DATA ===========");

	        for (Student s : students) {
	            s.displayStudentData();
	        }
	    }
}