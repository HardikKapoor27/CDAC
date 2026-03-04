package coreJava;

public class InsuranceApp {

	public static void main(String[] args) {
		
	PolicyuHolderManagement pm = new PolicyuHolderManagement();
	
	pm.NumberOfHolders();
	PolicyHolder[] p = pm.GetPolicyHolders();
	pm.AllPolicyHolderMethods(p);
		
	}

}
