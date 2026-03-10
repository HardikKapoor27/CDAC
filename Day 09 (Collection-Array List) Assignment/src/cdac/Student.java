package cdac;

public class Student {
	
    int studentId;
	String studentName;
	String course;
	float marks;
	
	public Student(int studentId, String studentName, String course, float marks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
		
	}

	public void DispStudent() {
		
		System.out.println("ID: " + studentId);
		System.out.println("Name: " + studentName);
		System.out.println("Course: " + course);
		System.out.println("Marks: " + marks);
		System.out.println();
		
	}

}
