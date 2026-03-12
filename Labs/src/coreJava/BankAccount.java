package coreJava;

import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);

        Transaction t = new Transaction("Deposit", amount);
        t.displayTransaction();
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Updated Balance: " + balance);

            Transaction t = new Transaction("Withdraw", amount);
            t.displayTransaction();
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Inner Class
    class Transaction {
        private String type;
        private double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public void displayTransaction() {
            System.out.println("Transaction Type: " + type);
            System.out.println("Transaction Amount: " + amount);
            System.out.println("-----------------------------");
        }
    }
}
