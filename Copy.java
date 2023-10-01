package com.ritesh;

public class Copy {
    private String name;
    private int age;
    public Copy(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Copy(Copy other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        // Create a student object using the parameterized constructor
        Copy student1 = new Copy("Alice", 20);

        // Create a copy of student1 using the copy constructor
        Copy student2 = new Copy(student1);

        // Display information for both students
        System.out.println("Student 1 Details:");
        student1.displayStudentInfo();

        System.out.println("\nStudent 2 Details (Copy of Student 1):");
        student2.displayStudentInfo();
    }
}
