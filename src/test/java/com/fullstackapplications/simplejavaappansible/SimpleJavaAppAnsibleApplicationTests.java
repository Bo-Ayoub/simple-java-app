package com.fullstackapplications.simplejavaappansible;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class SimpleJavaAppAnsibleApplicationTests {

	@Test
	void contextLoads() {
	}


	private final Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		assertEquals(8, calculator.add(5, 3));
	}

	@Test
	void testSubtract() {
		assertEquals(6, calculator.subtract(10, 4));
	}

}
