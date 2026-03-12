package emp;

 abstract class Employee {
	 int empId;
	 String name;
	 double basicSalary;
	
	 public Employee(int empId, String name, double basicSalary) {
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	 
	 public void displayEmployee() {
		 
		 System.out.println("\nName: " + name );
		 System.out.println("Id: " + empId );
		 
	 }
	 
	 abstract void calculateSalary();
}
