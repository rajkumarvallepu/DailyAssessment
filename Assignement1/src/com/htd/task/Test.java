package com.htd.task;

public class Test {

	public static void main(String[] args) {
		Sales s = new Sales();
		System.out.println(Sales.checkProductId(99999));
		System.out.println(s.getAmount('M'));
	}

}
