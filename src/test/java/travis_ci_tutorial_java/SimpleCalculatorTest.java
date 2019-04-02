package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	
	@Test 
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator(); 
		assertEquals(calc.multiply(5, 2), 10);
	}
	
	@Test 
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(10, 2), 5);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideZero() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.divide(10, 0);
	}
	
	//@SuppressWarnings("deprecation")
	@Test
	public void testRoot() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.squarert(25.0), 5.0, 5.0);
	}
	
	@Test 
	public void testNegRoot() {
		SimpleCalculator calc = new SimpleCalculator();
		try {
			int a = -4;
			calc.squarert(a);
			if (a < 0) {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException e) {
			System.out.println("Cannot sqaure root a negative number!");
		}
		
		
	}
	

}
