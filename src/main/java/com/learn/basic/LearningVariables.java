package com.learn.basic;

public class LearningVariables {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("I am Deepa");
		byte b1 = 123;
		short sh1 = 1234;
		int i1 = 12345;
		long l1 = 1224456;
		float f1 = 123.45f;
		double d1 = 2345.84575;
		char ch1 = 'D';
		String s1 = "Harmanjit Singh";
		boolean boo1 = true;
		System.out.println(b1);
		System.out.println(sh1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(ch1);
		System.out.println(s1);
		System.out.println(boo1);
		/*
		 * % - modulus - remainder in division ++ increment -- decrement
		 * 
		 */
		int num1 = 10;
		int num2 = 3;
		++num1;
		num1++;
		int num3 = num1 % num2;
		int num4 = num1++;
		int num5 = --num2;
		System.out.println(num3);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num4);
		System.out.println(num5);

		/*
		 * logical operators && || !
		 */
		boolean boo2 = false;
		System.out.println(boo1 || boo2);
		int test1 = 60;
		int test2 = 42;
		int test3 = test1 & test2;
		System.out.println(test3);

	}

}
