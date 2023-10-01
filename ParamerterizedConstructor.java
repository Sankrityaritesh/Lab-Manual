package com.ritesh;

public class ParamerterizedConstructor {
    private String name;
    private int age;

    // Parameterized constructor
    public ParamerterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ParamerterizedConstructor student1 = new ParamerterizedConstructor("Janardhan", 20);
        student1.displayStudentInfo();
        ParamerterizedConstructor student2 = new ParamerterizedConstructor("Joginder", 21);
        student2.displayStudentInfo();
    }
}
