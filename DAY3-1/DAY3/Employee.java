package cdac;

import java.util.Scanner;

public class Employee 
{

	int empno;
	String name;
	float sal;
	String add;
	
	
	public void getEmployeeData()
	{
		System.out.println("enter the employee details");
		Scanner s = new Scanner(System.in);
		empno =s.nextInt();
		name = s.next();
		sal = s.nextFloat();
		add = s.next();
		
		
	}
	
	public void displayEmployee()
	{
		
		System.out.println(empno);
		System.out.println(name);
		System.out.println(sal);
		System.out.println(add);
		
		
	}
	
	public void findbonus()
	{
		float bonus=0;
		bonus =  sal*0.05f;
		System.out.println(bonus);
		
	}
	
	
	
}
