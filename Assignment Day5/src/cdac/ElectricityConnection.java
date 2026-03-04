package cdac;

public class ElectricityConnection {
	
	int consumerId;
	String consumerName;
	int unitsConsumed;
	double bill;

	public ElectricityConnection(int consumerId, String consumerName, int unitsConsumed) {

		this.consumerId = consumerId;
		this.consumerName = consumerName;
		this.unitsConsumed = unitsConsumed;
	}

	public void displayConsumer() {

		System.out.println("\nConsumer ID: " + consumerId);
		System.out.println("Consumer Name: " + consumerName);
		System.out.println("Units Consumed: " + unitsConsumed);
	}

	class BillCalculator {

		public void calculateBill() {

			if (unitsConsumed <= 100) {
				bill = unitsConsumed * 5;
			} 
			else if (unitsConsumed <= 200) {
				bill = (100 * 5) + ((unitsConsumed - 100) * 7);
			} 
			else {
				bill = (100 * 5) + (100 * 7) + ((unitsConsumed - 200) * 10);
			}

			System.out.println("Total Electricity Bill: " + bill);
			System.out.println("----------------------------------");
		}
	}
	
}
