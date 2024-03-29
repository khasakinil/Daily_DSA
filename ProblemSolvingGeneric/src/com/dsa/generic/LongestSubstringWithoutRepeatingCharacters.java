package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 */

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String args[]) {
		String str = "abcabcbb";
		String longestSubStrWithoutRepeatingChars = getLongestSubstringWithoutRepeatingCharacters(str);
		System.out.println(longestSubStrWithoutRepeatingChars + " : " + longestSubStrWithoutRepeatingChars.length());
	}

	private static String getLongestSubstringWithoutRepeatingCharacters(String str) {
		if (str.length() == 1) {
			return str;
		}
		String longestStr = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String subStr = str.substring(i, j + 1);
				if (subStr.length() > 0 && subStr.length() > longestStr.length() && !containsDupChar(subStr)) {
					longestStr = subStr;
				}
			}
		}
		return longestStr;
	}

	private static boolean containsDupChar(String subStr) {
		boolean containDupChar = false;
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i < subStr.length(); i++) {
			charCount.put(subStr.charAt(i), charCount.getOrDefault(subStr.charAt(i), 0) + 1);
			if (charCount.get(subStr.charAt(i)) > 1) {
				containDupChar = true;
				break;
			}
		}
		return containDupChar;
	}
}
