package cdac;

import java.util.Scanner;

public class TestArraywithSwitch 
{

	public static void main(String[] args) 
	{
	
		
		while(true)
		{
		System.out.println("1: create array");
		System.out.println("2: iterate the array");
		System.out.println("3:  update the array");
		System.out.println("4: find max from the array");
		System.out.println("5: exit");
		Scanner s = new Scanner(System.in);
		System.out.println("enter the option");
		int op = s.nextInt();
		
		switch(op)
		{
		case 1: ArrayManagement.createArray();
		break;
		case 2: ArrayManagement.iterateArrayElement();
		break;
		case 3: ArrayManagement.updateArrayElement();
		break;
		case 4: ArrayManagement.findMax();
		break;
		case 5: System.exit(0);
		break;
		default: System.out.println("invalid option"); 
					
		}
		
	    
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
