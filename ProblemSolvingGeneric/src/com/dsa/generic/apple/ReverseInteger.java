package com.dsa.generic.apple;

/**
 * 7. Reverse Integer 
 * Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0. 
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned). 
 * Example 1: Input: x= 123 
 * Output: 321 
 * Example 2: Input: x = -123 
 * Output: -321 
 * Example 3: Input: x= 120 
 * Output: 21
 */
public class ReverseInteger {

	public static void main(String args[]) {
		System.out.println(reverse(1056389759));
	}

	public static int reverse(int x) {
		if (!(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)) {
			return 0;
		}
		int reversed = 0;
		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
			x = -(x);
		}
		while (x > 0) {
			if (reversed < Integer.MIN_VALUE / 10 || reversed > Integer.MAX_VALUE / 10) {
				reversed = 0;
				break;
			}
			int rem = x % 10;
			reversed = reversed * 10 + rem;
			x = x / 10;
		}
		return isNegative ? -reversed : reversed;
	}
}
