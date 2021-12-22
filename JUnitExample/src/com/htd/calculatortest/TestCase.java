package com.htd.calculatortest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCase {

	@Test
	public void testAdd() {
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";

		assertEquals("Junit is working fine", str);

		assertFalse(num > 6);

		assertNotNull(temp);

	}

	@Test
	public void testNum() {
		int num = 5;

		assertTrue(num == 5);
	}

}
