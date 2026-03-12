package coreJava;
import java.util.Scanner;

public class Change {
	
	
	
	public static int change(int num) {
		int Fknum = num+1;
		num = Fknum;
		
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int OGnum = sc.nextInt();
		System.out.println("Original number was: " + OGnum);
		
		int res =change(OGnum);
		System.out.println("now the number is: " + res);
		
	}

}
