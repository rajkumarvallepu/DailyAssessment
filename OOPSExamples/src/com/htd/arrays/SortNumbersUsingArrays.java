package com.htd.arrays;

import java.util.*;

public class SortNumbersUsingArrays {
	public static void main(String[] args) {
		int num[] = { 50, 20, 45, 82, 25, 63 };
		int l = num.length;
		int i;
		System.out.print("Given number : ");
		for (i = 0; i < l; i++) {
			System.out.print("  " + num[i]);
		}
		System.out.println("\n");
		System.out.print("Ascending order number : ");
		Arrays.sort(num);
		for (i = 0; i < l; i++) {
			System.out.print("  " + num[i]);
		}
	}
}
