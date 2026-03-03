package coreJava;

import java.util.Scanner;

public class Change2 {
	
	
	public static int[] changearr(int [] O ) {
		O[0] = O[0+1];
		return O;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Og = {1,2,3};
		
		System.out.println("The Og array is: ");
		for(int i=0;i<Og.length;i++) {
			System.out.print(Og[i] + " " );
		}

		System.out.println();
		int[] res =changearr(Og);
		System.out.println("The Fake array is: "  );
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " " );
		}
	}

}
