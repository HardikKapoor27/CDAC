package cdac;

public class passbyvalue
{


	public static void change(int a, int b) 
	{
		
		a = 20;
		b = 30;
		
	}


	public static void main(String[] args) 
	{
	
		int a = 10;
		int b = 20;
		
		System.out.println("a = "+ a + "  b = "+b);
		
		change(a, b);
		
		System.out.println("a = "+ a + "  b = "+b);
		
		
		
	}

	
	
}
