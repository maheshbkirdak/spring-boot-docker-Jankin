package com.docker.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerJankinApplication {
	
	@GetMapping("/msg1")
	public String getString() {
		return "Welcome to Docker 30!!";
	}
	
	@GetMapping("/msg2")
	public String getString2() {
		return "Welcome to Docker 38!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerJankinApplication.class, args);
	}
	
	

}
