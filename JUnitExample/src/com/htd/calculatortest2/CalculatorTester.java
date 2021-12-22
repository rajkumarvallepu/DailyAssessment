package com.htd.calculatortest2;

import org.junit.*;

public class CalculatorTester {
	MainCalculator g;
	int result;

	@Test
	public void TestingGreaterNumber1() {
		int expected = 50;
		result = g.greatest(20, 10, 50);
		Assert.assertEquals(expected, result);
	}

	@Before
	public void TestingAddition() {
		System.out.println("This Test case will execute first");
		g = new MainCalculator();
		int result = 0;
	}

	@After
	public void TestingSubtraction() {
		System.out.println("Executes after the Test");
		g = null;
		result = 0;
	}

	@AfterClass
	public static void TestingMultiplication() {
		System.out.println("Executes in the End of the class");
	}

	@BeforeClass
	@Ignore
	public static void TestingModulo() {
		System.out.println("Executes before loading class in memory");
	}

	@Test
	public void TestingDivision() {
		MainCalculator g = new MainCalculator();
		double result = g.division(10, 3);
		Assert.assertEquals(3.3, result, 0.5);
	}
}
