package com.example.SpringBoot3Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot3PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3PracticeApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "Hello, Spring Boot 3!!";
	}
}
