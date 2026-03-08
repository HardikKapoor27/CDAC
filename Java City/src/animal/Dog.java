package animal;

public class Dog extends Animal {
	
	public Dog(String animalType) {
		super(animalType);
	}

	public void makeSound() {
		System.out.println("Woof Woof !!");
		System.out.println();
	}
}