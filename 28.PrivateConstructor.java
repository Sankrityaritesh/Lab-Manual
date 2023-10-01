package com.ritesh;

public class PrivateConstructor {
    private PrivateConstructor() {
    }
    public static PrivateConstructor getInstance() {
        return new PrivateConstructor();
    }

    public void displayMessage() {
        System.out.println("This is a private constructor.");
    }

    public static void main(String[] args) {
        PrivateConstructor obj = PrivateConstructor.getInstance();
        obj.displayMessage();
    }
}

