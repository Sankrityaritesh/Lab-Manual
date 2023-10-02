package com.ritesh;

public class MethodOverloading {
    void print() {
        System.out.println("No parameters");
    }
    void print(int num) {
        System.out.println("Int parameter: " + num);
    }
    void print(int num1, int num2) {
        System.out.println("Two int parameters: " + num1 + ", " + num2);
    }
    void print(double num) {
        System.out.println("Double parameter: " + num);
    }

    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();
        example.print();
        example.print(42);
        example.print(10, 20);
        example.print(3.14);
    }
}
