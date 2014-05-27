package com.rpnmde.service;

import java.util.*;
import java.util.Scanner;
import java.text.*;
import java.lang.Math;
import java.io.InputStream;
import java.text.DecimalFormat;

public class PostfixCalc {
	
	public static void main(String args[]) {
			
}

	public Double calculate(String input) {

		Stack<Double> stack = new Stack<Double>();
		boolean exit = false;
		
		String delims = "[,]";
		String[] tokens = input.split(delims);
		
		for (int i = 0; i < tokens.length; i++) {
			String var = String.valueOf(tokens[i].trim());
			
			if (var.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if (var.equals("-")) {
				Double denominator = stack.pop();
				stack.push(stack.pop() - denominator);
			} else if (var.equals("*")) {
				stack.push(stack.pop() * stack.pop());
			} else if (var.equals("/")) {
				Double denominator = stack.pop();
				DecimalFormat df = new DecimalFormat();
				Double div = Double.valueOf(df.format(stack.pop() / denominator));
				stack.push(div);
			} else {
				stack.push(Double.parseDouble(var));
			}
			
		}
		return stack.pop();
		
		/*
		while (!exit) {
			String input = new String();
			System.out.println("Evaluating: " + input);
			if (confirmNumber(input)) {
				stack.push(Double.parseDouble(input));
			} else if (confirmOperator(input) && stack.size() > 1) {
				if (input.equals("+")) {
					stack.push(((Double) stack.pop()).doubleValue() + ((Double) stack.pop()).doubleValue());
					System.out.println(stack);
				} else if (input.equals("-")) {
					double s1 = ((Double) stack.pop()).doubleValue();
					double s2 = ((Double) stack.pop()).doubleValue();
					stack.push(s2 - s1);
					System.out.println(stack);
				} else if (input.equals("*")) {
					stack.push(((Double) stack.pop()).doubleValue() * ((Double) stack.pop()).doubleValue());
					System.out.println(stack);
				} else if (input.equals("/")) {
					double d1 = ((Double) stack.pop()).doubleValue();
					double d2 = ((Double) stack.pop()).doubleValue();
					stack.push(Math.round((d2/d1)*1e3)/1e3);
					System.out.println(stack);
				}
			}
		}	
		*/
		
		
	}
	
	
	public static Boolean confirmNumber(String input) {
		try {
			double num = Double.parseDouble(input.trim());
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	public static Boolean confirmOperator(String input) {
		List<String> ops = Arrays.asList("+", "-", "/", "*");
		if (ops.contains(input.trim())) {
			return true;
		} else
			return false;
	}

}

