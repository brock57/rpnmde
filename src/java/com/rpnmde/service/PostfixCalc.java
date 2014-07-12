package com.rpnmde.service;

import java.util.*;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;
import com.rpnmde.service.ParseInput;

public class PostfixCalc {
	
	public static void main(String args[]) {
			
}
	
	public static interface Operation {
		public BigDecimal operate(BigDecimal val1, BigDecimal val2);
	}
	
	public static Map<String, Operation> operations = new HashMap<String, Operation>();
	
	static {
		operations.put("+", new Operation(){public BigDecimal operate(BigDecimal val1, BigDecimal val2) {
			return val1.add(val2); }});
		operations.put("-", new Operation(){public BigDecimal operate(BigDecimal val1, BigDecimal val2) {
			return val2.subtract(val1); }});
		operations.put("*", new Operation(){public BigDecimal operate(BigDecimal val1, BigDecimal val2) {
			return val1.multiply(val2); }});
		operations.put("/", new Operation(){public BigDecimal operate(BigDecimal val1, BigDecimal val2) {
			return val2.divide(val1, 3, RoundingMode.HALF_UP); }});
	}
	
	public BigDecimal calculate(String input) {
		
		Stack<BigDecimal> stack = new Stack<BigDecimal>();
		boolean exit = false;
		
		ParseInput parser = new ParseInput();
		
		String[] tokens = parser.parseInput(input);
		
		for (int i = 0; i < tokens.length; i++) {
			String var = String.valueOf(tokens[i].trim());
			
			if (operations.containsKey(var)) {
				stack.push(operations.get(var).operate(stack.pop(), stack.pop()));
			} else {
				stack.push(new BigDecimal(var));
			}
			
		}
		return stack.pop();
		
	}
	
	public static Boolean confirmNumber(String input) {
		try {
			//BigDecimal num = BigDecimal.parseBigDecimal(input.trim());
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

