package com.example.AAAPattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AaaPatternApplication {

	public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("App Running...");
    }

}
