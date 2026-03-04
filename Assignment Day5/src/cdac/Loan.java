package cdac;

public class Loan {
	
	double loanAmount;
	double interestRate;
	int loanTenure;
	double emi;

	public Loan(double loanAmount, double interestRate, int loanTenure) {

		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanTenure = loanTenure;
	}

	public void displayLoan() {

		System.out.println("\nLoan Amount: " + loanAmount);
		System.out.println("Interest Rate: " + interestRate);
		System.out.println("Loan Tenure (Years): " + loanTenure);
	}

	class EMICalculator {

		public void calculateEMI() {

			double simpleInterest = (loanAmount * interestRate * loanTenure) / 100;
			double totalAmount = loanAmount + simpleInterest;

			emi = totalAmount / (loanTenure * 12);

			System.out.println("Monthly EMI: " + emi);
			System.out.println("----------------------------------");
		}
	}

}
