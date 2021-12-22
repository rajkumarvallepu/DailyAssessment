package com.htd.arrays;

public class MatrixOperationUsingArrays {
	public static void main(String args[]) {
		int i, j, k;
		int mat1[][] = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		int mat2[][] = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		System.out.println("Operation ON Matrices \n1.Addition \n");
		int sum[][] = new int[3][3];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print("\t" + sum[i][j]);
			}
			System.out.println("\t");
		}
		System.out.println("2.Subtraction\n");
		int diff[][] = new int[3][3];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				diff[i][j] = mat1[i][j] - mat2[i][j];
				System.out.print("\t" + diff[i][j]);
			}
			System.out.println("\t");
		}
		System.out.println("3.Multiplication\n");
		int prod[][] = new int[3][3];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				prod[i][j] = 0;
				{
					for (k = 0; k < 3; k++)
						prod[i][j] = prod[i][j] + mat1[i][k] * mat2[k][j];
				}
				System.out.print("\t" + prod[i][j]);
			}
			System.out.println("\t");
		}
	}
}
