package emp;

public class FullTimeEmployee extends Employee {
	
	double finalSalary;
	double hra;
	int allowance;

	public FullTimeEmployee(int empId, String name, double basicSalary, int allowance) {
		super(empId, name, basicSalary);
	    this.allowance = allowance;
	}

	@Override
	public void calculateSalary() {
		
		hra = basicSalary*(0.5);
		finalSalary = basicSalary + hra + allowance;
		
	}
	
	public void displayFullTimeEmployee() {
		
		System.out.println("=========Full Time Employee Details=======");
		
		this.displayEmployee();
		System.out.println("\nBase Salary: " + basicSalary);
		System.out.println("HRA: " + hra);
		System.out.println("Allowance: " + allowance);
		System.out.println("Final Salary: " + finalSalary);
	}
	
}
