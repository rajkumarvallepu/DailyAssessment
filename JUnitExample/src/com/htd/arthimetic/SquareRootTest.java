package com.htd.arthimetic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareRootTest {
	public SquareRootTest() { }
	
	@Test
	public void testFindSquareroot() {
	SquareRoot instance = new SquareRoot();
	double result = instance.findSquareroot(6.25); 
	double expResult = 2.5;
	assertEquals("findSquareroot",expResult, result, 0.0);
	}
}
