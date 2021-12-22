package com.test_calculator;

import org.junit.*;

// Failing cases

public class CalculatorTester {
	MainCalculator g;
    int result;

    @Test //(timeout=10, expected=Exception.class)
    public void TestingGreaterNumber1() {
        int expected=50;
        result = g.greatest(20, 10, 50);
        Assert.assertEquals(expected, result);
    }
 
    @Before
    public void TestingAddition() {
        System.out.println("This Test case will execute first");
        g = new MainCalculator();
        int result=0;
    }
 
    @After
    public void TestingSubtraction() {
        System.out.println("Executes after the Test");
        g=null;
        result =0;
    }
 
    //In @AfterClass And @BeforeClass static should be present and it is a one time thing
    
    @AfterClass
    public static void TestingMultiplication() {
        System.out.println("Executes in the End of the class");
    }
 
    @BeforeClass
    @Ignore
    // when the class loads into LVM
    public static void TestingModulo() {
        System.out.println("Executes before loading class in memory");
    }
    @Test
    public void TestingDivision() {
        MainCalculator g = new MainCalculator();
        double result = g.division(10, 3);
        Assert.assertEquals(3.3,result,0.5);
    }
}
