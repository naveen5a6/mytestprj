package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringbootApplication.class, args);
		System.out.println("This is my first app in my lap");
	}
}
