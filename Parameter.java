package com.ritesh;

public class Parameter {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Call the add function and pass two integers as parameters
        int result = add(5, 3);

        // Print the result
        System.out.println("Sum: " + result);
    }
}
