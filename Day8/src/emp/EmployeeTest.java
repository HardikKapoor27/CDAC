package emp;

public class EmployeeTest {

	public static void main(String[] args) {

		FullTimeEmployee fe = new FullTimeEmployee(1, "Virat", 50000.00, 5000);
		fe.calculateSalary();
		fe.displayFullTimeEmployee();
		
		ContractEmployee ce = new ContractEmployee(2, "Rohit", 35000.00, 120, 80);
		ce.calculateSalary();
		ce.displayContractEmployee();
	}

}
