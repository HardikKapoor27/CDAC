package cdac;

public class Person
{
	String name;
	int age;
	
	public Person(String name, int age)
	{
		
		this.name = name;
		this.age = age;
	}

	void displayPerson()
	{
		System.out.print(name+ " " +age);
	}
	
}

class Emp extends Person
{
	int empno;
	float basicSalary;
	
	
	public Emp(String name,int age,int empno, float basicSalary) 
	{
		super(name,age);
		this.empno = empno;
		this.basicSalary = basicSalary;
	}

	void displayEmployee()
	{
		System.out.print(" "+empno+" "+basicSalary);
	}
	
	void calculateSalary()
	{
		float netsal =0.0f; 
		netsal =  basicSalary*12;
		System.out.print(" "+netsal);
	}
		
}


class Manager  extends Emp
{
	float bonus;
	
	Manager(String name,int age,int empno,float basicSalary ,float bonus)
	{
		super(name,age,empno,basicSalary);
		this.bonus = bonus;
	}
	
	
	
	void displayManager()
	{
		
		System.out.print(bonus);
	}
	
	
	
}





 class TestSimpleInheritance
{
	public static void main(String[] args)
	{
	
		System.out.println("employee details");
		Emp e = new Emp("nsnathan",55,1001,40000);
		
		e.displayPerson();
		e.displayEmployee();
		e.calculateSalary();
		System.out.println();
		
		
		System.out.println("manager details");
		Manager m = new Manager("siju",34,1002,50000,3000);
		m.displayPerson();
		m.displayEmployee();
		m.displayManager();
		m.calculateSalary();
		
		
	}
}

