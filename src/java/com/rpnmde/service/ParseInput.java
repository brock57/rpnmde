package com.rpnmde.service;

public class ParseInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	
	public static String[] parseInput(String input) {
		String delims = "[,]";
		String[] tokens = input.split(delims);
		return tokens;
	}

}
