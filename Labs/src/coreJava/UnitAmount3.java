package coreJava;

import java.util.Scanner;

public class UnitAmount3 {

    // Non-static method
    public int calcUnitAmt(int units) {

        int amount = 0;
        int rate = 1;
        int n = 1;
        
        while (units > 0) {

            int slabunits = Math.min(100, units);
            amount = amount + (slabunits * rate);
            units = units - slabunits;
            n++;

            if (rate < n) {
                rate++;
            }
        }

        return amount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number of units : ");
        int units = sc.nextInt();
       

        // Create object of class
        UnitAmount3 obj = new UnitAmount3();

        // Call method using object
        int Totalamt = obj.calcUnitAmt(units);

        System.out.println("Total amount according to number of units is " 
                           + Totalamt + " Rs.");
    }
}