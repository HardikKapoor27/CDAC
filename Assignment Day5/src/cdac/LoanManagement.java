package cdac;

import java.util.Scanner;

public class LoanManagement {
	
	int ln;
	Scanner sc = new Scanner(System.in);

	public int numberOfLoans() {

		System.out.print("Enter number of Loans: ");
		ln = sc.nextInt();
		return ln;
	}

	public Loan[] getLoans() {

		Loan[] l = new Loan[ln];

		for (int i = 0; i < l.length; i++) {

			System.out.print("Enter Loan Amount: ");
			double amount = sc.nextDouble();

			System.out.print("Enter Interest Rate: ");
			double rate = sc.nextDouble();

			System.out.print("Enter Loan Tenure (Years): ");
			int tenure = sc.nextInt();

			l[i] = new Loan(amount, rate, tenure);
		}

		return l;
	}

	public void allLoanMethods(Loan[] l) {

		for (int i = 0; i < l.length; i++) {

			l[i].displayLoan();

			Loan.EMICalculator ec = l[i].new EMICalculator();
			ec.calculateEMI();
		}
	}

}
