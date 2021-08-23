package com.learn.oops;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OopsConcepts {
	public static void main(String[] args) {
		System.out.println("Hello World");
		//random numbers between 10000 to 50000
		long x =  Math.round(40000 * Math.random() + 10000);
		System.out.println(x);
		
		/* reverse string code
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1 = s1.next();
		String temp = "";
		System.out.println(str1 + " Reverse is : ");
		for(int i = 0; i< str1.length(); i++) {
			temp = str1.charAt(i) + temp;
		}
			
		System.out.println(temp);*/
		//generate random numbers between 1 to 10
		Random r1 = new Random();
		System.out.println(r1.nextInt(10) + 1);
		
		//random number between 5000 to 10000
		System.out.println(r1.nextInt(5000) + 5000);
		
		//arraylist
		ArrayList<String> str = new ArrayList <String>();
		String A = new String("woohooo");
		str.add(A);
		
		String B = new String("woww");
		str.add(B);
		
		int theSize = str.size();
		System.out.println(theSize + " my array size");
		
		Object o = str.get(0);
		System.out.println(o);
		
		
		
		
		
	}
}
