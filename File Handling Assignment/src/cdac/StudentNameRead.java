package cdac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentNameRead {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("StudentNames.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		System.out.println("Student Names : \n");

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
		
		fr.close();
		br.close();
	}

}
