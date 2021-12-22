package com.htd.assertexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	String message = "Hello World";   
	   MessageUtil messageUtil = new MessageUtil(message);
	   @Test
	   public void testPrintMessage() {
	      assertEquals(message,messageUtil.printMessage());
	   }
}
