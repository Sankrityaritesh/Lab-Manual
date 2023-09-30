package com.ritesh;

public class CallAnInstance {
    private int instanceVariable;

    // Constructor to initialize instanceVariable
    public CallAnInstance(int value) {
        this.instanceVariable = value;
    }

    // Instance method
    public void printInstanceVariable() {
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        // Create an object of CallAnInstance
        CallAnInstance obj = new CallAnInstance(42);

        // Call the instance method on the object
        obj.printInstanceVariable();
    }
}
