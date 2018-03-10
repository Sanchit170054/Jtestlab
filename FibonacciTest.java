package a_Introductory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testFib() {
		Fibonacci tester = new Fibonacci();
		assertEquals("0", 0, tester.fib(0));
		assertEquals("1", 1, tester.fib(1));
		assertEquals("2", 1, tester.fib(2));
		assertEquals("3", 2, tester.fib(3));
		assertEquals("4", 3, tester.fib(4));
		assertEquals("5", 5, tester.fib(5));
		assertEquals("6", 8, tester.fib(6));
		assertEquals("7", 13, tester.fib(7));
	}

} 
