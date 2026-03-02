package cdac;

import java.util.Scanner;

public class SwitchCalculator {
	

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\nMenu :");
            System.out.println("1: Addition");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("\n!! Exiting Calculator...");
                break;
            }

            System.out.print("\nEnter First Number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();

            System.out.println();

            switch (choice) {

                case 1:
                    System.out.println("Result: " + Choices.Add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result: " + Choices.Sub(num1, num2));
                    break;

                case 3:
                    System.out.println("Result: " + Choices.Mul(num1, num2));
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero !!");
                    } else {
                        System.out.println("Result: " + Choices.Div(num1, num2));
                    }
                    break;

                default:
                    System.out.println("Invalid Choice !!");
            }

            System.out.println();
        }

        sc.close();
    }
}
