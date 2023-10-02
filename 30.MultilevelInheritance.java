package com.ritesh;

// Parent class
class Grandparent {
    void grandparentMethod() {
        System.out.println("This is a method of the Grandparent class.");
    }
}
class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("This is a method of the Parent class.");
    }
}
class Child extends Parent {
    void childMethod() {
        System.out.println("This is a method of the Child class.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Create an object of the Child class
        Child childObj = new Child();

        // Call methods from all three classes
        childObj.grandparentMethod();
        childObj.parentMethod();
        childObj.childMethod();
    }
}
