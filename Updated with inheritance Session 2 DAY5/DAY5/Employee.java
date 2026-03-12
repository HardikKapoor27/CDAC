package cdac;

public class Employee 
{

	int empno;
	String ename;
	float sal;
	public Employee(int empno, String ename, float sal) 
	{
		
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	
	public void displayEmployee()
	{
		System.out.println(empno+ename+sal);
		
		
	}
	
	
}
