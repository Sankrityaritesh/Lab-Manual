package com.ritesh;

class Superclass {
    int superValue;
    Superclass(int value) {
        superValue = value; // Initialize the superclass variable
        System.out.println("Superclass Parameterized Constructor");
    }
}

class Subclass extends Superclass {
    int subValue;
    Subclass(int superValue, int subValue) {
        super(superValue);
        this.subValue = subValue;
        System.out.println("Subclass Parameterized Constructor");
    }
}

public class CallParameterized {
    public static void main(String[] args) {
        // Create an object of the subclass with parameters
        Subclass subObj = new Subclass(100, 200);

        // Access variables from both the superclass and subclass
        System.out.println("Superclass Value: " + subObj.superValue);
        System.out.println("Subclass Value: " + subObj.subValue);
    }
}
