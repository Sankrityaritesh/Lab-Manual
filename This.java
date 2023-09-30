package com.ritesh;

public class This {
    private String name;

    // Constructor
    public This(String name) {
        // Using "this" to distinguish between instance variable and constructor parameter
        this.name = name;
    }

    // Instance method
    public void printName() {
        // Accessing the instance variable using "this"
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        // Create an object of ThisExample class
        This obj = new This("John");

        // Call the instance method to print the name
        obj.printName();
    }
}
