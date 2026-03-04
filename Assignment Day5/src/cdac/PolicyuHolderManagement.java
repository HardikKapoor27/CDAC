package cdac;

import java.util.Scanner;

public class PolicyuHolderManagement {

   int phn;
   Scanner sc = new Scanner(System.in);
   
   public int NumberOfHolders() {
	   
	   System.out.print("Enter the no of PolicyHolders: ");
	   phn = sc.nextInt();
	   return phn;
	   
   }
   
   public PolicyHolder[] GetPolicyHolders() {

	    PolicyHolder[] p = new PolicyHolder[phn];
		
	    for (int i = 0; i < p.length; i++) {

	        System.out.print("\nEnter Policy Number: ");
	        int policyNumber = sc.nextInt();

	        sc.nextLine();
	        System.out.print("\nEnter Name: ");
	        String name = sc.nextLine();

	        System.out.print("\nEnter Age: ");
	        int age = sc.nextInt();

	        System.out.print("\nEnter Sum Assured: ");
	        double sumAssured = sc.nextDouble();

	        p[i] = new PolicyHolder(policyNumber,name, age,sumAssured);  // Constructor used properly
	    }

	    return p;
	}
   
   public void AllPolicyHolderMethods(PolicyHolder[] p) {
	   
	   for(int i = 0; i < p.length; i++) {
		   p[i].displayPolicyHolder();
		   p[i].PremiumAmt();
	   }
   }
	

}
