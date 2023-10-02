package com.ritesh;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Call the makeSound method on both objects
        animal.makeSound(); // Calls the Animal class's method
        dog.makeSound();    // Calls the overridden method in the Dog class
    }
}
