package cdac;

import java.util.ArrayList;

public class StudentManagement {
	
	Student s1 = new Student(101, "Hardik", 88.5);
	Student s2 = new Student(102, "Anjali", 92.0);
	Student s3 = new Student(103, "Rohan", 76.4);
	Student s4 = new Student(104, "Sneha", 95.8);
	Student s5 = new Student(105, "Vikram", 81.2);
	
	ArrayList<Student> al = new ArrayList<>();
	
	public void addStudent() {
	
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
	}
}
