package com.javatechie.jenkin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringJenkinsApplication {

	@PostConstruct
	public void init() {
		log.info("Application started...");
	}
	
	public static void main(String[] args) {
		log.info("Application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
