package cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Hardik", "Advance Computing", 98.5f);
		Student s2 = new Student(101, "Arun Kumar", "Computer Science", 88.5f);
		Student s3 = new Student(102, "Priya Sharma", "Information Technology", 92.0f);
		Student s4 = new Student(103, "Rahul Verma", "Electronics", 76.5f);
		Student s5 = new Student(104, "Sneha Reddy", "Mechanical", 81.0f);
		Student s6 = new Student(105, "Vikram Singh", "Civil", 69.5f);
		
		ArrayList<Student> st = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int choice;

		do {

			System.out.println("\nSTUDENT MENU");
			System.out.println("\n1. Add Students");
			System.out.println("2. Display Students");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Sort Students");
			System.out.println("7. Exit");

			System.out.print("\nEnter Choice: ");
			choice = sc.nextInt();

			switch(choice) {

			// ADD
			case 1:

				st.add(s1);
				st.add(s2);
				st.add(s3);
				st.add(s4);
				st.add(s5);
				st.add(s6);

				System.out.println("\nStudents Added Successfully\n");

				for(Student obj : st) {
					obj.DispStudent();
				}

				break;

				// DISPLAY
			case 2:

				for(Student obj : st) {
					obj.DispStudent();
				}

				break;

				// SEARCH
			case 3:

				System.out.print("\nEnter ID to Search: ");
				int sid = sc.nextInt();

				boolean found = false;

				for(Student obj : st) {

					if(obj.studentId == sid) {

						obj.DispStudent();
						found = true;
						break;
					}
				}

				if(!found)
					System.out.println("\nStudent Not Found");

				break;

				// UPDATE
			case 4:

				System.out.print("\nEnter ID whose marks you want to Update: ");
				int sid2 = sc.nextInt();

				System.out.print("\nEnter New Marks: ");
				float m = sc.nextFloat();

				boolean found2 = false;

				for(Student obj : st) {

					if(obj.studentId == sid2) {

						obj.marks = m;

						System.out.println("\nMarks Updated Successfully");
						obj.DispStudent();
						found2 = true;
						break;
					}
				}

				if(!found2)
					System.out.println("\nStudent Not Found");

				break;

				// DELETE
			case 5:

				System.out.print("\nEnter ID to Delete: ");
				int sid3 = sc.nextInt();

				int pos = -1;

				for(Student obj : st) {

					if(obj.studentId == sid3) {

						pos = st.indexOf(obj);
						st.remove(pos);

						System.out.println("\nStudent Deleted Successfully");
						break;
					}
				}

				for(Student obj : st) {
					obj.DispStudent();
				}

				break;

				// SORT MENU
			case 6:

				int c;

				do {

					System.out.println("\nSORT STUDENT MENU");
					System.out.println("\n1. Sort by Name");
					System.out.println("2. Sort by Marks");
					System.out.println("3. Exit");

					System.out.print("\nEnter Choice: ");
					c = sc.nextInt();

					switch(c) {

					case 1:
						st.sort((a,b) -> a.studentName.compareTo(b.studentName));
						System.out.println("\nStudent Sorted By Name : \n");
						break;

					case 2:
						st.sort((a,b) -> Float.compare(a.marks,b.marks));
						System.out.println("\nStudent Sorted By Marks : \n");
						break;
					}

					for(Student obj : st) {
						obj.DispStudent();
					}

				} while(c != 3);

				break;

			case 7:
				System.out.println("\nExiting Program...");
				break;

			default:
				System.out.println("\nInvalid Choice");
			}

		} while(choice != 7);

		sc.close();
   }
}
