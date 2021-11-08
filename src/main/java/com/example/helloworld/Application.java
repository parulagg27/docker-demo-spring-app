package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = "com.example.helloworld")
public class Application {

	@GetMapping(value = "/")
	public String home() {
		return "Welcome to docker image!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
