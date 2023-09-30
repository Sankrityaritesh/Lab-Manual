package com.ritesh;
public class MyClass {
    private int instanceVariable;
    public MyClass(int value) {
        this.instanceVariable = value;
    }
    public static void staticMethod() {
    }

    public static void staticMethodWithInstance(MyClass instance, int newValue) {
        instance.instanceVariable = newValue;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(5);

        staticMethodWithInstance(obj, 10);

        System.out.println("Updated instanceVariable: " + obj.instanceVariable);
    }
}
