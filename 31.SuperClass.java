package com.ritesh;

public class SuperClass {
    class Superclass {
        int superValue;
        Superclass() {
            superValue = 100;
            System.out.println("Superclass Default Constructor");
        }
    }
    class Subclass extends Superclass {
        int subValue;
        Subclass() {
            subValue = 200; // Initialize the subclass variable
            System.out.println("Subclass Default Constructor");
        }
    }
    public static void main(String[] args) {
        // Create an object of the subclass
        SuperClass superClassObj = new SuperClass();
        Subclass subObj = superClassObj.new Subclass();

        // Access variables from both the superclass and subclass
        System.out.println("Superclass Value: " + subObj.superValue);
        System.out.println("Subclass Value: " + subObj.subValue);
    }
}
