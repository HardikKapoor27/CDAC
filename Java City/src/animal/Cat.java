package animal;

public class Cat extends Animal {
	
	public Cat(String animalType) {
		super(animalType);
	}

	public void makeSound() {
		System.out.println("Meow Meow !!");
		System.out.println();
	}
	
}