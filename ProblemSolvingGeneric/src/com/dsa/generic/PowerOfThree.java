package com.dsa.generic;

/*
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * 
 * Example 1:
 * Input: n = 27
 * Output: true
 * Explanation: 27 = 3^3
 * 
 * Example 2:
 * Input: n = 0
 * Output: false
 * Explanation: There is no x where 3x = 0.
 */
public class PowerOfThree {
	public static void main(String[] args) {
		int input = 216;
		int powerNum = 3;
		boolean isPowerOfThree = getIsPowerOfThree(input, powerNum);
		System.out.println(isPowerOfThree);
	}

	private static boolean getIsPowerOfThree(int input, int powerNum) {
		if (input <= 0) {
			return false;
		}
		while (input != 1) {
			if (input % powerNum != 0) {
				return false;
			}
			input = input / powerNum;
		}
		return true;
	}
}
