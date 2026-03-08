package animal;

public class Vet {

	public void checkHealth(Animal a) {
		
		System.out.println("Vet is examining " + a.getAnimalType() + ".....");
		System.out.println("\n" + a.getAnimalType() + " responses: ");
		
		a.makeSound();
	}
}
