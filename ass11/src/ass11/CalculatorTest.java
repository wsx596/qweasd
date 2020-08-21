package ass11;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void evaluteExperession() {
		Calculator cal = new Calculator();
		int sum = cal.evaluate("1+2+3");
		assertEquals(6, sum);
	}

}
