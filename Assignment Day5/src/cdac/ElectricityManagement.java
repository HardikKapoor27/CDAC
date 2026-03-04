package cdac;

import java.util.Scanner;

public class ElectricityManagement {
	
	int cn;
	Scanner sc = new Scanner(System.in);

	public int numberOfConsumers() {

		System.out.print("Enter number of Consumers: ");
		cn = sc.nextInt();
		return cn;
	}

	public ElectricityConnection[] getConsumers() {

		ElectricityConnection[] e = new ElectricityConnection[cn];

		for (int i = 0; i < e.length; i++) {

			System.out.print("Enter Consumer ID: ");
			int id = sc.nextInt();

			sc.nextLine();
			System.out.print("Enter Consumer Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Units Consumed: ");
			int units = sc.nextInt();

			e[i] = new ElectricityConnection(id, name, units);
		}

		return e;
	}

	public void allConsumerMethods(ElectricityConnection[] e) {

		for (int i = 0; i < e.length; i++) {

			e[i].displayConsumer();

			ElectricityConnection.BillCalculator bc = e[i].new BillCalculator();
			bc.calculateBill();
		}
	}

}
