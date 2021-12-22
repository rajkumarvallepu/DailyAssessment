package com.junit_annotation;

//import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(ExecutionProcedureUnit.class);
	      int failCount = 0;
	      
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	         failCount++;
	      }

	      System.out.println(result.wasSuccessful());
	      System.out.println(failCount);
	   }
}
