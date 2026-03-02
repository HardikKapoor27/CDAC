package cdac2;

import java.util.Scanner;

public class Student {

    int id;
    String name;
    String course;
    String[] subjects;
    float[] marks;
    char[] grades;
    float percentage;
    String result;

    public void getStudentData(Scanner sc) {

        System.out.println("\n========== Enter Student Details ==========\n");

        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.println("\nSelect Course:\n");
        System.out.println("1. Advance Computing");
        System.out.println("2. Computer Science");
        System.out.println("\nEnter choice:  \n");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            course = "Advance Computing";
            subjects = new String[]{"Core Java", "C++", "DBMS", "OOPS"};
        } else {
            course = "Computer Science";
            subjects = new String[]{"DSA", "OS", "CN", "Python"};
        }

        marks = new float[subjects.length];
        grades = new char[subjects.length];

        System.out.println("\nSubjects for " + course + ":\n");
        for (String s : subjects) {
            System.out.println("-> " + s);
        }

        System.out.println("\nEnter Marks:\n");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = sc.nextFloat();
            grades[i] = calculateGrade(marks[i]);
        }

        calculatePercentageAndResult();
    }

    private char calculateGrade(float m) {
        if (m >= 90) return 'A';
        if (m >= 80) return 'B';
        if (m >= 70) return 'C';
        if (m >= 60) return 'D';
        return 'F';
    }

    private void calculatePercentageAndResult() {
        float total = 0;
        boolean fail = false;

        for (float m : marks) {
            total += m;
            if (m < 40) fail = true;
        }

        percentage = total / marks.length;
        result = fail ? "FAIL" : "PASS";
    }

    public void displayStudentData() {

        System.out.println("\n========== Student Data ==========\n");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);

        System.out.println("\n------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s%n", "Subject", "Marks", "Grade");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-20s %-10.1f %-10c%n",
                    subjects[i], marks[i], grades[i]);
        }

        System.out.println("------------------------------------------------");
        System.out.printf("Percentage : %.2f%%%n", percentage);
        System.out.println("Result     : " + result);
    }

}