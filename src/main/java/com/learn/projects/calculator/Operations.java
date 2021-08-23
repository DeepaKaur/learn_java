package com.learn.projects.calculator;

// It takes operator and does the calculations on operands
public class Operations {

	public long calculate(String operator, long firstNum, long secondNum) {
		long answer = 0;
		if (operator.equals("*")) {
			answer = firstNum * secondNum;
			System.out.println("i am in multiply");
		} else if (operator.equals("+")) {
			answer = firstNum + secondNum;
			System.out.println("i am in add");
		} else if (operator.equals("-")) {
			answer = firstNum - secondNum;
			System.out.println("i am in subtract");
		} else if (operator.equals("/")) {
			answer = firstNum / secondNum;
			System.out.println("i am in divide");
		} else {
			System.out.println("i am in else");
		}
		
		return answer;
	}

}
