package assigments;

import java.util.Scanner;

public class ReverseNumMain {
	
	public static int Reverse(int num) {
		
		int reversednumber = 0;
		while(num > 0) {
		    reversednumber = reversednumber * 10 + (num % 10);
		    num = num / 10;
		}
		
		return reversednumber;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		
		int ReversedNum = Reverse(num);
		
		System.out.print("Reversed number is : " + ReversedNum);

	}

}
