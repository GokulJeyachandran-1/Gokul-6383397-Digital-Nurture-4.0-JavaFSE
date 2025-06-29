package com.example.SetupJUnit;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SetupJUnitApplication {

	public static void main(String[] args) {
        System.out.println("Hello");
    }

    public String greet() {
        return "Hello";
    }
}
