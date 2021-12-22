package com.htd.arrays;

import java.util.*;

public class FindSumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Please Enter Number " + (i + 1));
			int num = sc.nextInt();
			sum = sum + num;
		}
		System.out.println("The Final Result is : " + sum);
	}
}
