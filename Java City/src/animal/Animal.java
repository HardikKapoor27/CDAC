package animal;

public class Animal {
	
	String animalType;

	public Animal(String animalType) {
		this.animalType = animalType;
	}

	public void makeSound() {
		System.out.println("Animal Sound");
	}

	public String getAnimalType() {
		return animalType;
	}
}
