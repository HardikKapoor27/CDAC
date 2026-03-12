package cdac;

import java.util.Scanner;

public class EmployeeManagement 
{

	public void displayAllEmp(Employee[] e )
	{
		System.out.println("display all emp details");
		
		
		for(int i=0;i<3;i++)
		{
			e[i].displayEmployee();
		}
	
	}

	public Employee[] createEmployeeArray() 
	{
		Scanner s = new Scanner(System.in);
		Employee[] e = new Employee[3];
		for(int i = 0;i<3;i++)
		{  
			System.out.println("enter emp " + i+1 + "details ");
			
			e[i]= new Employee(s.nextInt(),s.next(),s.nextFloat());
		}
		
		return e;
	}
	
	
}
