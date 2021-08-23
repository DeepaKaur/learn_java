package com.learn.basic;

public class LearningStringSlice {
	
	private static String DATA = 
			"First name,Last name,40,123 Street Sydney, Australia";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ABCDE";
		System.out.println(str1.charAt(0));
		
		/*
		 * write a program to reverse the string
		 */
		
		int strLength = str1.length();
		System.out.print("Original string = " + str1 + "  Reverse String = ");
		for(int i=strLength-1; i>=0; i--) {
			System.out.print(str1.charAt(i));
		}
		System.out.println("");
		str1.substring(2);
		
		String delim = ",";
		String [] arr = DATA.split(delim);
		for(String s : arr) {
			System.out.println(s.trim());
		}
	}

}
