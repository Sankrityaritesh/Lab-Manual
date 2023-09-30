package com.ritesh;

public class With {
    private static int staticVariable = 0;

    // Static method that increments the static variable
    public static void incrementStaticVariable() {
        staticVariable++;
    }

    // Static method that prints the static variable
    public static void printStaticVariable() {
        System.out.println("Static variable: " + staticVariable);
    }

    public static void main(String[] args) {
        // Call static methods directly without creating an instance
        incrementStaticVariable();
        printStaticVariable();

        // Call them again to see the effect
        incrementStaticVariable();
        printStaticVariable();
    }
}
