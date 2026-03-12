package cdac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentFileHandling {
	
	public static void main(String[] args) throws IOException {
		
		StudentManagement sm = new StudentManagement();
		sm.addStudent();
		
		
		FileOutputStream fos = new FileOutputStream("StudentObjects");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		
	}

}
