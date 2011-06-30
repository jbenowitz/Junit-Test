package de.vogella.junit.first;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClass2Test {

	@Test
	public void testMultiply() {
		MyClass2 tester = new MyClass2();
		assertEquals("Result", 2, tester.divide(4, 2));
	}
}