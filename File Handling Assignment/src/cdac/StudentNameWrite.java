package cdac;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentNameWrite {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("StudentNames.txt");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Five Student Names : \n");
		
		for(int i = 1; i <= 5; i++) {
            String name = sc.nextLine(); 
            fw.write(name + "\n");
        }
		
		fw.close();
		System.out.println("\nStudent Names Added to File !!");
		
		
	}

}
