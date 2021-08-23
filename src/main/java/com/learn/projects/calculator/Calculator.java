package com.learn.projects.calculator;

public class Calculator {
	private InputUI inputUI = new InputUI();
	private OutputUI outputUI = new OutputUI();
	private Operations c1 = new Operations();
	// private String name = "Deepa";
	
	public void run() {
		// take input
		String[] input = inputUI.getInput();
		
		// parse
		String operator = input[1];
		long firstNum = Long.parseLong(input[0]);
		long secondNum = Long.parseLong(input[2]);
	
		// calc
		long answer = c1.calculate(operator, firstNum, secondNum);

		// print output
		outputUI.print(answer);	
	}



}
