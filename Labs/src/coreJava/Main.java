package coreJava;


// A simple Java program demonstrating a typical object

// Class definition (blueprint)
class Car {
    // Fields (attributes)
    String brand;
    int year;

    // Constructor (used to initialize objects)
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method (behavior)
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
 
public class Main {
    public static void main(String[] args) {
        // Creating objects (instances of Car)
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Tesla", 2023);

        // Calling methods on objects
        car1.displayInfo();
        car2.displayInfo();
    }
}

