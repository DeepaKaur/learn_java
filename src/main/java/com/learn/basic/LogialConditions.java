package com.learn.basic;

public class LogialConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num1 = 79999300;
		long num2 = 452100;
		long num3 = 43300;

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is biggest");
			} else {
				System.out.println(num3 + "is biggest");
			}

		} else {
			if (num2 > num3) {
				System.out.println(num2 + " is biggest");
			} else {
				System.out.println(num3 + "is biggest");
			}
		}

	}

}
