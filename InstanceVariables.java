package com.ritesh;

public class InstanceVariables {
    private int value;

    public InstanceVariables(int value) {
        this.value = value;
    }
    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        InstanceVariables obj1 = new InstanceVariables(5);
        InstanceVariables obj2 = new InstanceVariables(10);

        System.out.println("Object 1:");
        obj1.displayValue();

        System.out.println("Object 2:");
        obj2.displayValue();
    }
}