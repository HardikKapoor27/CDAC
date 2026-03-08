package main;

import java.util.Scanner;
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

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== JAVA CITY MENU =====");
            System.out.println("\n1 Citizens");
            System.out.println("2 Vehicles");
            System.out.println("3 Power Grid");
            System.out.println("4 Pet Shelter");
            System.out.println("5 Smart Home");
            System.out.println("7 Exit");
            
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    testCitizens();
                    break;

                case 2:
                    testVehicles();
                    break;

                case 3:
                    testPowerGrid();
                    break;

                case 4:
                    testPetShelter();
                    break;

                case 5:
                    testSmartHome();
                    break;

                case 6:
                    System.out.println("\nExiting Java City...");
                    break;

                default:
                    System.out.println("\nInvalid choice");
            }

        } while(choice != 6);

        sc.close();
    }

    static void testCitizens() {

        System.out.println("===== JAVA CITY CITIZENS =====");

        Citizen cz1 = new Citizen("Alex", 25, 1234, "Ale@123");

    }

    static void testVehicles() {

        System.out.println("\n===== JAVA CITY VEHICLES =====");

        Bicycle b2 = new Bicycle(20);
        Car c2 = new Car(80, 50);

    }

    static void testPowerGrid() {

        System.out.println("\n===== JAVA CITY POWER GRID =====");

        ShoppingMall sm1 = new ShoppingMall("DB MALL");
        sm1.consumeEnergy(5000);

        TinyHouse th1 = new TinyHouse("Electronic City");
        th1.consumeEnergy(500);

    }

    static void testPetShelter() {

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

    }

    static void testSmartHome() {

        System.out.println("\n===== JAVA CITY SMART HOME =====");

        SmartRoom room = new SmartRoom();

        room.pressWallSwitch();
        room.partyMode();

    }
}