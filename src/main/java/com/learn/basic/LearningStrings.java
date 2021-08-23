package com.learn.basic;

public class LearningStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * concatenate
		 *  length 
		 *  trim 
		 *  lowercase
		 *   uppercase 
		 *   empty
		 */
		String str1 = "HELLO ";
		String str2 = "world";
		String str3 = str1 + str2;
		System.out.println(str3);
		String str4 = str1.concat(str2);
		System.out.println(str4);
		int num1 = 100;
		System.out.println(str4 + num1);
		System.out.println(str4.length());
		String str5 = "     fgfg     gfgf      fff    ";
		System.out.println(str5.trim());
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());
		System.out.println(str4.isEmpty());
		String str6 = "";
		System.out.println(str6.isEmpty());

		/*
		 * string comparison 
		 * equals 
		 * compare 
		 * matches(it uses regular expression?)
		 */

		String s1 = "ABCDE";
		String s2 = "abcde";
		s1.equals(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("strings are equal");
		} else {
			System.out.println("strings are not equal");
		}

		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		String patt ="[A-Z]{1,}";
		System.out.println(s1.matches(patt));
		
		/*
		 * string search
		 * contains - case sensitive so if we have to use it ignoring case
		 * we have to convert strings to lowercase or uppercase and then compare
		 * startwith
		 * endwith
		 * index of
		 * last index of
		 * 
		 */
		
		String strtest1 = "I love Java and love Selenium";
		String strtest2 = "java";
		System.out.println(strtest1.contains(strtest2));
		
		System.out.println(strtest1.toLowerCase().contains(strtest2.toLowerCase()));
		
		System.out.println(strtest1.startsWith("I"));
		System.out.println(strtest1.endsWith("Selenium"));
		
		System.out.println(strtest1.indexOf("love"));
		System.out.println(strtest1.indexOf("love",6));
		System.out.println(strtest1.lastIndexOf("love"));
	}

}
