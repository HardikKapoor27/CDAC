package cdac;

public class BankAccount {
	private int accountNumber;
	private String AccountHolderName;
	private double balance;
	
		public BankAccount( int accountNumber, String AccountHolderName, double balance  ) {
			this.accountNumber = accountNumber;
			this.AccountHolderName = AccountHolderName;
			this.balance = balance; 
			
		}
			
		public void Deposit(double amount ) {
			if(amount <= 0 ) {
				System.out.println("Invalid Deposit!");
			} else {
				balance = balance + amount;
				System.out.println("Amount Deposited: " + amount );
				System.out.println("Updated Balance: " + balance );
				
				Transaction t = new Transaction("Deposit", amount);
				t.displayTypeOfTransaction();
				
			}
		}
		
		public void WithDraw(double amount) {
			if(amount > balance) {
				System.out.println("Insufficient Balance");
			} else {
				balance -= amount;
				System.out.println("Amount Withdrawn: " + amount  );
				System.out.println("Updated Balance: " + balance);
				
				Transaction t = new Transaction("Withdraw", amount );
				t.displayTypeOfTransaction();
			}
		}
		
		public class Transaction{
			String type;
			double amount;
			
			public Transaction(String type, double amount) {
				this.type = type;
				this.amount = amount;
			}
			
			public void displayTypeOfTransaction() {
				System.out.println("Transaction Type:   " + type );
				System.out.println( "Tramsaction Amount: " + amount);
				System.out.println("-----------------------------");
			}
			
		}
		
}
