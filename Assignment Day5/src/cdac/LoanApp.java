package cdac;

public class LoanApp {
	
	public static void main(String[] args) {

		LoanManagement lm = new LoanManagement();

		lm.numberOfLoans();
		Loan[] l = lm.getLoans();
		lm.allLoanMethods(l);
	}

}
