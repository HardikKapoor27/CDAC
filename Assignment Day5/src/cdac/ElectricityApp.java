package cdac;

public class ElectricityApp {
	
	public static void main(String[] args) {

		ElectricityManagement em = new ElectricityManagement();

		em.numberOfConsumers();
		ElectricityConnection[] e = em.getConsumers();
		em.allConsumerMethods(e);
	}

}
