package cdac;

class A
{
	
	public void dispA()
	{
		System.out.println("dispA");
	}
	
}

class B extends A
{
	
	public void dispB()
	{
		System.out.println("dispB");
	}
	
}

public class TestInheritance 
{

	public static void main(String[] args) 
	{
		
		B b = new B();
		b.dispB();
		b.dispA();
				
	
	}
	
}
