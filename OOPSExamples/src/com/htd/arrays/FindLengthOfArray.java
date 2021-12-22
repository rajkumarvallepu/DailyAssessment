package com.htd.arrays;

import java.util.*;

public class FindLengthOfArray {
	public static void main(String args[]) {
		int n, i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter elements");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("length:" + a.length);
	}
}
