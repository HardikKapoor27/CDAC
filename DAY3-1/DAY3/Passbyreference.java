package cdac;

public class Passbyreference
{

	public static void change(int[] n) 
	{
				n[0] = 100;
			
	}
	
		public static void main(String[] args) 
	{
	
		int[] num = { 10,20,30,40,50};
		System.out.println("before calling the change function");
		for(int ele :num)
		{
			System.out.println(ele);
		}
				change(num);
				System.out.println("after calling the change function");
		
		
		for(int ele :num)
		{
			System.out.println(ele);
		}
	}

	
	
	
	
}
