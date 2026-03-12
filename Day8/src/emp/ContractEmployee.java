package emp;

public class ContractEmployee extends Employee {

	double finalSalary;
	int hoursWorked;
	double ratePerHour;
	
	public ContractEmployee(int empId, String name, double basicSalary, int hoursWorked, double ratePerHour) {
		super(empId, name, basicSalary);
		this.hoursWorked = hoursWorked;
		this.ratePerHour = ratePerHour;
		
	}

	@Override
	void calculateSalary() {
		
		finalSalary = basicSalary + (hoursWorked*ratePerHour);
	}
	
	public void displayContractEmployee() {

		System.out.println("\n=========Contract Employee Details=======");

		this.displayEmployee();
		System.out.println("\nBase Salary: " + basicSalary);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Rate Per Hour: " + ratePerHour);
		System.out.println("Final Salary: " + finalSalary);
	}

}
