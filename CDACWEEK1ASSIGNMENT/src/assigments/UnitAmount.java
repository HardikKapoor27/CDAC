package assigments;
import java.util.Scanner;

public class UnitAmount {

	public static int CalcUnitAmount(int unit) {
		
		int amount = 0;
		
        if (unit > 100) {   
        	amount += 100 * 1;
            unit -= 100;
        }
        else {
            amount += unit * 1;
            return amount;
        }

        if (unit > 100) {
            amount += 100 * 2;
            unit -= 100;
        } 
        else {
            amount += unit * 2;
            return amount;
        }

        if (unit > 100) {
            amount += 100 * 3;
            unit -= 100;
        }
        else {
            amount += unit * 3;
            return amount;
        }

        amount += unit * 4;
		
		return amount;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your units : ");
		int unit = sc.nextInt();
		
		int TotalUnitAmount = CalcUnitAmount(unit);
		
		System.out.print("Total amount for the units is : " + TotalUnitAmount + "Rs.");
	}

}
