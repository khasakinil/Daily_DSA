package com.dsa.generic;
/*
 * Given a binary string s, return the number of non-empty substrings that have the same 
 * number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 * Substrings that occur multiple times are counted the number of times they occur.
 */

public class CountBinarySubstrings {
	public static void main(String[] args) {
		String s = "00110011";
		int binarySubstringCoung = getBinarySubstringsCount(s);
		System.out.println("binarySubstringCoung : " + binarySubstringCoung);
	}

	private static int getBinarySubstringsCount(String s) {
		int prevLen = 0, currLen = 1, result = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				currLen++;
			} else {
				prevLen = currLen;
				currLen = 1;
			}
			if (prevLen >= currLen) {
				result++;
			}
		}
		return result;
	}
}
