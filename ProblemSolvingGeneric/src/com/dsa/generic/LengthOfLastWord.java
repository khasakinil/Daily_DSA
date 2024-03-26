package com.dsa.generic;

/*
 * 58. Length of Last Word
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * 
 */

public class LengthOfLastWord {
	public static void main(String args[]) {
		String s = "Hello World";
		int length = getLengthOfLastWord(s);
		System.out.println(length);
	}

	private static int getLengthOfLastWord(String s) {
		s = s.trim();
		int len = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				break;
			}
			len++;
		}
		return len;
	}
}
