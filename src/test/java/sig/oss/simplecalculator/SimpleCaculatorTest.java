package sig.oss.simplecalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCaculatorTest {

	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}

//	@Test
//	public void testSub() {
//		SimpleCalculator calc = new SimpleCalculator();
//		calc.sub(10, 20);
//		assertEquals(-10, calc.getResult());
//	}
//	@Test
//	public void testInc() {
//		SimpleCalculator calc = new SimpleCalculator();
//		calc.inc(10);
//		assertEquals(10, calc.getResult());
//	}

}