import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractionTest {

	@Test
	void testSub() {
		Subtraction tester = new Subtraction();
		assertEquals("zero", tester.sub(10, 10), "10 - 10 must be zero");

	}

}
