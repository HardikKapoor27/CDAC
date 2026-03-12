package cdac;

public class TestEmployee 
{

	public static void main(String[] args) 
	{
	
		Employee e1 = new Employee();
		
//		e1.empno = 1001;
//		e1.name = "nsnathan";
//		e1.sal = 30000;
//		e1.add = "Bangalore";
		
		e1.getEmployeeData();
		
		e1.displayEmployee();
		e1.findbonus();
		
//		System.out.println(e1.empno);
//		System.out.println(e1.name);
//		System.out.println(e1.sal);
//		System.out.println(e1.add);
		
		
		Employee e2 = new Employee();
//		e2.empno = 1002;
//		e2.name = "raj";
//		e2.sal = 40000;
//		e2.add = "Bangalore";
		
//		System.out.println(e2.empno);
//		System.out.println(e2.name);
//		System.out.println(e2.sal);
//		System.out.println(e2.add);
		
		e2.getEmployeeData();
		e2.displayEmployee();
		e2.findbonus();
	}
	
	
}
