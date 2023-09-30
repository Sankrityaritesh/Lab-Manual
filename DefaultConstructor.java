package com.ritesh;

public class DefaultConstructor {
    private int value;

    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Create an object of DefaultConstructor using the default constructor
        DefaultConstructor obj = new DefaultConstructor();

        // Call the instance method to display the value
        obj.displayValue();
    }
}
