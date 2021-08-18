package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator;

	@BeforeEach
	private void init() {
	     calculator = new Calculator();
		System.out.println("Init");

	}

	@Test
	void testAddInt() {

		int result = calculator.add(1, -3);
		assertEquals(-2, result, "Test Failed");
	}

	@Test
	void testAddFloat() {

		float result = calculator.add(11.1f, 3.1f);
		assertEquals(14.2, result, 0.200000762939453);
	}

	@Test
	void testAddFloatIfGreaterThan2() {

		float result = calculator.add(3.0F, 3.1F);
		assertEquals(6.1, result, 0.0000002);
	}

	@Test
	void testDivide() {
		Double result = calculator.divide(10, 2);
		assertEquals(5, result);
	
	}	
	
	@Test
	void testDivideDouble() {

		try {
			calculator.divide(10, 0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}

	}

}
