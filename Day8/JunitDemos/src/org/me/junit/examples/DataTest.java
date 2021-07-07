package org.me.junit.examples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataTest {

	@Test
	public void testData() {
		Data data = null;
		assertNull(data);
		
		Data obj1 = new Data();
		assertNotNull(obj1);
	}
	
	@Test
	public void testEvenOdd() {
		Data obj = new Data();
		assertTrue(obj.evenOdd(4));
		assertFalse(obj.evenOdd(5));
	}
	
	@Test
	public void testMax3() {
		Data obj = new Data();
		assertEquals(5, obj.max3(5, 2, 3));
		assertEquals(5, obj.max3(2, 5, 3));
		assertEquals(5, obj.max3(3, 2, 5));
	}
	
	@Test
	public void testSum() {
		Data obj = new Data();
		assertEquals(5, obj.sum(2, 3));
	}
	
	@Test
	public void testSayHello() {
		Data obj = new Data();
		assertEquals("Welcome to Junit...", obj.sayHello());
	}

}
