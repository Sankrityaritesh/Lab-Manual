package com.ritesh;

public class Without {
    private static int staticVariable = 0;

    // Static method 1
    public static void staticMethod1() {
        System.out.println("Inside staticMethod1");
        staticVariable = 10; // Directly access and modify the staticVariable
        System.out.println("staticVariable in staticMethod1: " + staticVariable);
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("Inside staticMethod2");
        System.out.println("staticVariable in staticMethod2: " + staticVariable);
    }

    public static void main(String[] args) {
        // Call staticMethod1
        staticMethod1();

        // Call staticMethod2
        staticMethod2();
    }
}
