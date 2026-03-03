package coreJava;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\nMenu : \n");
            System.out.println("1: Addition");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Exit\n");

            System.out.print("Enter your choice: \n");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("!! Exiting Calculator...");
                break;
            }

            System.out.print("Enter First Number: ");
            int num1 = sc.nextInt();

            System.out.print("\nEnter Second Number: ");
            int num2 = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Result: \n" + Choices.Add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result: \n" + Choices.Sub(num1, num2));
                    break;

                case 3:
                    System.out.println("Result: \n" + Choices.Mul(num1, num2));
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero !!");
                    } else {
                        System.out.println("\nResult: " + Choices.Div(num1, num2));
                    }
                    break;

                default:
                    System.out.println("Invalid Choice !!");
            }
        }

        sc.close();
    }
}