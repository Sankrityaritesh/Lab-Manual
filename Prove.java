package com.ritesh;

public class Prove {
    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    // Static method that attempts to access instanceMethod directly
    public static void staticMethod() {
    }

    public static void main(String[] args) {
        // Create an instance of Prove
        Prove obj = new Prove();

        // Call the instance method on the object
        obj.instanceMethod();

        // Call the static method
        staticMethod();
    }
}
