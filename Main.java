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


How it works:

Car class defines attributes (brand, year) and a method (displayInfo).
Objects (car1, car2) are created using the new keyword.
Each object has its own copy of the fields but shares the same methods.
Methods are called on objects to perform actions.


Example Output:
Brand: Toyota, Year: 2020
Brand: Tesla, Year: 2023


If you want, I can also show you a Java object with encapsulation (private fields + getters/setters) to demonstrate a more professional OOP style.
Do you want me to prepare that version?
