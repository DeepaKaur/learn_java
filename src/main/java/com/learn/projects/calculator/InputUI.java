package com.learn.projects.calculator;

import java.util.Scanner;

// Takes input in the form of a + b and split it into Strings
public class InputUI {
	private Scanner sc = new Scanner(System.in);

	public String[] getInput() {
		System.out.println("Enter the input for calculation : ");
		String str = sc.nextLine();
		String delim = " ";
		String[] inputs = str.split(delim);
	
		return inputs;
	}

}
