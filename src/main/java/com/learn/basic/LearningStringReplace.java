package com.learn.basic;

public class LearningStringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * replace normal
		 * replace all
		 */

		String str1 = "Sukhm1234n and Simr1234n 1234re brilli1234nt!";
		String str2 = "1234";
		String str3 = "a";
		System.out.println(str1.replace(str2, str3));
		
		String str4 = "I% am&*%$#@ D!@#~eepa%$#";
		String patt = "[^A-Za-z0-9\\s]";
		System.out.println(str4.replaceAll(patt,""));
		
		
	}

}
