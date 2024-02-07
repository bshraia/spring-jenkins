package com.javatechie.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class SpringJenkinsApplicationTests {

	@Test
	void contextLoads() {
		log.info("Test case executing...");
		log.info("Test case executing second log statement...");
		assertEquals(true, true);
	}

}
