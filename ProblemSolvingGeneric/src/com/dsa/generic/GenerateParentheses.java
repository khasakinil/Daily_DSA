package com.dsa.generic;

import java.util.ArrayList;
import java.util.List;

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * 
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * 
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 */

public class GenerateParentheses {

	public static void main(String[] args) {
		List<String> allPossibleParanthesis = new ArrayList<>();
		generateAllPossibleParanthesis(allPossibleParanthesis, 3, 0, 0, "");
		System.out.println("allPossibleParanthesis : " + allPossibleParanthesis);
	}

	private static void generateAllPossibleParanthesis(List<String> allPossibleParanthesis, int n, int open, int close,
			String currStr) {
		if (currStr.length() == n * 2) {
			allPossibleParanthesis.add(currStr);
			return;
		}

		if (open < n) {
			generateAllPossibleParanthesis(allPossibleParanthesis, n, open + 1, close, currStr + "(");
		}

		if (close < open) {
			generateAllPossibleParanthesis(allPossibleParanthesis, n, open, close + 1, currStr + ")");
		}
	}

}
