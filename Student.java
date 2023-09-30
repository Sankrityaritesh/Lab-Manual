package com.ritesh;

public class Student {
    private String name;
    private int rollNumber;
    private int age;

    // Constructor to initialize the student's details
    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Instance method to display student information
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Alice", 101, 20);
        Student student2 = new Student("Bob", 102, 21);

        // Access and display information of the first student
        System.out.println("Student 1 Details:");
        student1.displayStudentInfo();
        System.out.println();

        // Access and display information of the second student
        System.out.println("Student 2 Details:");
        student2.displayStudentInfo();
    }
}
