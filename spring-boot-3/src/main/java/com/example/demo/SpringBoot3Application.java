package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication@Configuration
public class SpringBoot3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3Application.class, args);
		System.out.println("Server started !!!");
	}

}
