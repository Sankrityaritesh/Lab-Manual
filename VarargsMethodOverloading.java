package com.ritesh;

public class VarargsMethodOverloading {
    void printNumbers(int... numbers) {
        System.out.print("Int parameters: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method that accepts multiple double values using varargs
    void printNumbers(double... numbers) {
        System.out.print("Double parameters: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarargsMethodOverloading example = new VarargsMethodOverloading();

        // Call methods with different numbers of arguments
        example.printNumbers(1, 2, 3);
        example.printNumbers(4.5, 6.7);
        example.printNumbers(8);
    }
}
