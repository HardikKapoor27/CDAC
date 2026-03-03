package coreJava;

/*
Minimum deposit for "Savings" = 1000
Minimum deposit for "Current" = 5000
If deposit is less → set balance to minimum required
*/

public class BankAccount {
	private String accountHolderName;
	private int accountNumber;
	private double balance;
	private String accountType;
	private int initialDeposit;
	private static final String bankName = "UBI";
	
	public BankAccount(String accountHolderName, int accountNumber, double balance,
			String accountType, int initialDeposit) {

		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
		this.initialDeposit = initialDeposit;

		AccountDetailDisplay();
	}

	
	public void AccountDetailDisplay() {
		
		System.out.println("\n===== Bank Account Details =====");
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Number     : " + accountNumber);
		System.out.println("Account Type       : " + accountType);
		System.out.println("Bank Name          : " + bankName);
		System.out.println("Initial Deposit    : " + initialDeposit);
		System.out.println("Current Balance    : " + balance);
		System.out.println("================================\n");
	}
	

}

