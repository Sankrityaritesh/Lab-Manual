package com.ritesh;

public class Difference {
    private int instanceVar;

    // Constructor to initialize the instance variable
    public Difference(int instanceVar) {
        // Initialize the instance variable with the parameter value
        this.instanceVar = instanceVar;
    }

    // Instance method
    public void instanceMethod(int localVar) {
        // This is an instance method that has an instance variable and a local variable.

        // Access the instance variable (this.instanceVar)
        System.out.println("Instance Variable: " + this.instanceVar);

        // Access the local variable
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        // Create an object of VariableExample
        Difference obj = new Difference(42);

        // Call the instance method and pass a local variable
        int localVar = 10;
        obj.instanceMethod(localVar);
    }
}
