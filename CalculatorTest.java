import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator underTest;

	@BeforeEach
	void setUp() throws Exception {
		underTest = new Calculator();
	}

	@Test
	void testSubtract() {
		double result = 5 - 5.0;

		assertEquals(result, underTest.subtract(5, 5.0));

		result = 5 - 10;
		assertEquals(result, underTest.subtract(5, 10));
	}

	@Test
	void testAdd() {
		double result = 3;

		assertEquals(result, Calculator.add(1, 2));

	}

}
