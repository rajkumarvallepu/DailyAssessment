package com.htd.calculatortest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestApp{
	int value1, value2;
	
	@Before
	  public void setUp(){
			System.out.println("Test Started...");
			value1=3;
			value2=5;
			System.out.println("Initialising Test values as: "+value1+" and "+value2);
			System.out.println();
	  }
	
	@After
	   public void tearDown(){
		   value1=0;
		   value2=0;
		   System.out.println("Test Completed.");
	   }
	
	@BeforeClass
		public static void setUpClass(){
			System.out.println("@BeforeClass - oneTimeSetUp");
		}
	
	@AfterClass
		public static void tearDownClass(){
			System.out.println("@AfterClass - oneTimeTearDown");
		}
	
	@Test
	public void testAdd(){
		Calculator c1=new Calculator();
		int expectedresult=8;
		assertEquals(expectedresult,c1.add(value1, value2)); 
	}
	
	@Test
	public void test1() {
		int expectedresult = 8;
		Calculator c1 = new Calculator();
		assertTrue(expectedresult == c1.add(3, 5));
	}
	
	
}
