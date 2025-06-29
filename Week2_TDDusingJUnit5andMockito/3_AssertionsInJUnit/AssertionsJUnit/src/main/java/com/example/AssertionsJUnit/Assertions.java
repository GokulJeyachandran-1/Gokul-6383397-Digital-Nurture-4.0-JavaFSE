package com.example.AssertionsJUnit;
public class Assertions {

    public static void main(String[] args) {
        System.out.println("Addition: " + add(2, 3));
        System.out.println("Check if 5 > 3: " + isGreater(5, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isGreater(int a, int b) {
        return a > b;
    }

    public static Object getNull() {
        return null;
    }

    public static Object getNotNullObject() {
        return new Object();
    }
}

