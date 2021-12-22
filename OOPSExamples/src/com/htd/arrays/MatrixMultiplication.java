package com.htd.arrays;

import java.util.*;

public class MatrixMultiplication {
	public static void main(String args[]) {
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		int i, j, k;
		Scanner g = new Scanner(System.in);
		System.out.println("Enter A matrix Element:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = g.nextInt();
			}
		}
		System.out.println("Enter B matrix Element:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				b[i][j] = g.nextInt();
			}
		}
		System.out.println("RESULTANT MATRIX");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print("  " + c[i][j]);
			}
			System.out.println();
		}
	}
}
