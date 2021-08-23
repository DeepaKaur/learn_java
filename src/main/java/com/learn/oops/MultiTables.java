package com.learn.oops;

import java.util.Scanner;

public class MultiTables {

	public static void main(String[] args) {

		int[] rows = new int[10];
		int[] columns = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		Scanner S1 = new Scanner(System.in);
		// int num1 = S1.nextInt();
		for (int m : columns) {
			int num1 = columns[m-1];
			for (int i = 1; i <= 10; i++) {
				rows[i - 1] = num1 * i;
				System.out.println(rows[i - 1]);
			}
			System.out.println("---------------------");
		}
		
//		for (int n : rows) {
//			System.out.println(n);
//		}
	}

}
