package com.dsa.generic;

import java.util.HashSet;
import java.util.Set;

/*
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), 
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 * 
 * Example 1:
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * Example 2:
 * Input: n = 2
 * Output: false
 */
public class HappyNumber {

	public static void main(String[] args) {
		int n = 2;
		boolean isHappyNumber = isHappy(n);
		System.out.println("isHappyNumber : " + isHappyNumber);
	}

	public static boolean isHappy(int n) {
		Set<Integer> happySet = new HashSet<Integer>();
		while (n != 1 && !happySet.contains(n)) {
			int currentSqr = 0;
			happySet.add(n);
			while (n > 0) {
				int currentNum = n % 10;
				currentSqr += (currentNum * currentNum);
				n = n / 10;
			}
			n = currentSqr;
		}
		return n == 1;
	}
}
