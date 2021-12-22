package com.htd.superclass;

public class CounterDemoMain extends Counter{
	public static void main(String[ ] args)
    {
        Counter x = new Counter();
        x.increment().increment().increment().print();
    }
}
