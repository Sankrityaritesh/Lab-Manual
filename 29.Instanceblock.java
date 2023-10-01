package com.ritesh;

public class Instanceblock {
    private int value;
    {
        System.out.println("Instance Block 1: Executed before every constructor");
        value = 10;
    }
    public Instanceblock(int value) {
        System.out.println("Parameterized Constructor");
        this.value = value;
    }

    {
        System.out.println("Instance Block 2: Executed before every constructor");
    }
    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Create an object of InstanceBlock
        InstanceVariables obj1 = new InstanceVariables(20);
        obj1.displayValue();

        // Create another object of InstanceBlock
        InstanceVariables obj2 = new InstanceVariables(30);
        obj2.displayValue();
    }
}
