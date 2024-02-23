package com.example.spe_mini_project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpeMiniProjectApplicationTests {

	@Test
	public void testAddition() {
		assertEquals(5.0, SpeMiniProjectApplication.add(2.0, 3.0));
	}

	@Test
	public void testSubtraction() {
		assertEquals(2.0, SpeMiniProjectApplication.subtract(5.0, 3.0));
	}

	@Test
	public void testMultiplication() {
		assertEquals(24.0, SpeMiniProjectApplication.multiply(4.0, 6.0));
	}

	@Test
	public void testDivision() {
		assertEquals(5.0, SpeMiniProjectApplication.divide(10.0, 2.0));
	}

	@Test
	public void testSquareRoot() {
		assertEquals(4.0, SpeMiniProjectApplication.squareRoot(16.0));
	}

	@Test
	public void testFactorial() {
		assertEquals(120, SpeMiniProjectApplication.factorial(5));
	}

	@Test
	public void testNaturalLog() {
		assertEquals(2.302585092994046, SpeMiniProjectApplication.naturalLog(10.0), 0.0000001);
	}


	@Test
	public void testPower() {
		assertEquals(8.0, SpeMiniProjectApplication.power(2.0, 3.0));
	}

}
