package cdac;

import java.util.Scanner;

public class TestArrayofObject
{

	public static void main(String[] args) 
	{
	
		
		EmployeeManagement em = new EmployeeManagement();
		
		Employee[] e =em.createEmployeeArray();
		em.displayAllEmp(e);
		
		
//		e[0]= new Employee(1001,"nsnathan",30000);
//		
//		e[1]= new Employee(1002,"shan",40000);
//		
//		e[2]= new Employee(1003,"raj",50000);
		
		
		
		
		
	}
	
}
