package com.learn.basic;

import java.util.Random;
import java.util.Scanner;

public class LoopLearning {

	public static void main(String[] args) {
		/*
		 * find even numbers between 1 to 100
		 */

		long i;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number : " + i);
			}
		}

		/*
		 * Fibonacci series until 20
		 */

		long num1, num2, counter, num3;
		counter = 3;
		num1 = 0;
		num2 = 1;
		System.out.println("Fibonacci Series :");
		System.out.println(num1);
		System.out.println(num2);
		for (counter = 1; counter <= 18; counter++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}

		/*
		 * nested for loop * ** *** **** ***** ******
		 * 
		 * rows in outer for loop number of stars in inner for loop
		 */
		final String star = "+";
		final String blank = "";

		for (int p = 1; p <= 6; p++) {
			for (int q = 1; q <= p; q++) {
				System.out.print(star);
			}
			System.out.println(blank);
		}

		/**
		 * Guessing game
		 */

		Random r1 = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to guessing game, let's start!");
		int a = 0;
		int b = r1.nextInt(10);
		do {
			System.out.print("Guess number between 1 to 10: ");
			a = sc.nextInt();
		} while (a != b);
		System.out.println("You guessed it! You win! :)");
		sc.close();

	}

}
