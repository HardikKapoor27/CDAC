package coreJava;
import java.util.Scanner;

public class MaxArray {
	
	public static int[] TakeArrayInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter " + size + " Elements : ");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static int MaximumArray(int array[]) {
		
		int maxarr = array[0];
		
		if(array.length == 1) {
			return maxarr;
		}
		
		for(int i = 1 ; i < array.length ; i++) {
			if(array[i] > maxarr) {
				maxarr = array[i];
			}
		}
		
		return maxarr;
		
	}
	
	public static void main(String[] args) {
		
		int[] array = TakeArrayInput();
		
		System.out.print("Array Elements : ");
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
		
		int MaxArr = MaximumArray(array);
		
		System.out.print("\nThe maximum element of given array is " + MaxArr);
		
	}

}
