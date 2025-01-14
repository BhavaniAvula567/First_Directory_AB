// Define the package
package com.example.animal;

// Enum to represent different animal types
enum AnimalType {
    DOG, CAT, BIRD
}

// Class to represent an Animal
public class Animal {
    // Variables (fields) for the Animal class
    private String name;
    private AnimalType type;
    private int age;

    // Constructor for the Animal class
    public Animal(String name, AnimalType type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // Method to display details of the Animal
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
    }

    // Method to make the animal "speak" based on its type
    public void makeSound() {
        switch (type) {
            case DOG:
                System.out.println(name + " says: Woof!");
                break;
            case CAT:
                System.out.println(name + " says: Meow!");
                break;
            case BIRD:
                System.out.println(name + " says: Tweet!");
                break;
            default:
                System.out.println(name + " makes a sound.");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a few Animal objects
        Animal dog = new Animal("Rex", AnimalType.DOG, 3);
        Animal cat = new Animal("Whiskers", AnimalType.CAT, 2);

        // Display information and sounds for each animal
        dog.displayInfo();
        dog.makeSound();
        System.out.println(); // For better readability

        cat.displayInfo();
        cat.makeSound();
    }
}
