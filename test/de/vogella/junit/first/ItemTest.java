package de.vogella.junit.first;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ItemTest {
	
	Item item = new Item(null, null, "jcrew", 
					"1.00", null, null,
					null, null);

	@Test
	public void testGetBrand() {
		assertEquals("Result", "jcrew", item.getBrand());
	}

	@Test
	public void testGetPrice() {
		assertEquals("Result", "1.00", item.getPrice());
	}

}
