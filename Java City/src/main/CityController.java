package main;

import citizen.Citizen;
import transport.Bicycle;
import transport.Car;
import power.ShoppingMall;
import power.TinyHouse;
import animal.Animal;
import animal.Dog;
import animal.Cat;
import animal.Vet;
import smartHome.SmartRoom;

public class CityController {

	public static void main(String[] args) {
		
		System.out.println("===== JAVA CITY CITIZENS =====");

		Citizen cz1 = new Citizen("Alex", 25, 1234, "Ale@123");
		
		System.out.println("\n===== JAVA CITY VEHICLES =====");

        Bicycle b2 = new Bicycle(20);
        Car c2 = new Car(80, 50);
        
        System.out.println("\n===== JAVA CITY POWER GRID =====");
        
        ShoppingMall sm1 = new ShoppingMall("DB MALL");
        sm1.consumeEnergy(5000);
        
        TinyHouse th1 = new TinyHouse("Electronic City");
        th1.consumeEnergy(500);
        
        System.out.println("\n===== JAVA CITY PET SHELTER =====\n");
        
        Animal[] a = new Animal[4];
        
        a[0] = new Dog("Dog 1");
        a[1] = new Dog("Dog 2");
        
        a[2] = new Cat("Cat 1");
        a[3] = new Cat("Cat 2");
        
        for(int i = 0; i < a.length; i++) {
            a[i].makeSound();
        }
        
        Vet v = new Vet();
        
        for(int i = 0; i < a.length; i++) {
            v.checkHealth(a[i]);
        }
        
        System.out.println("\n===== JAVA CITY SMART HOME =====\n");
        
        SmartRoom room = new SmartRoom();

        room.pressWallSwitch();
        room.partyMode();
        
	}

}
