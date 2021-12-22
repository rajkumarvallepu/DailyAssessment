package com.htd.continue1;

public class Continue {
	public static void main(String[] args) {
		System.out.println("Odd Numbers");

		for (int i = 1; i <= 10; ++i) {
			if (i % 2 == 0)
				continue;

			System.out.print(i + "\t");
		}
	}
}
