package com.dsa.generic.apple;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "ab", "a" };
		System.out.println("LongestCommonPrefix : " + longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		int minStrLen = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < minStrLen) {
				minStrLen = strs[i].length();
			}
		}

		String baseStr = strs[0];
		int lastIndex = 0;

		boolean isPrefEnd = false;
		for (int i = 0; i < minStrLen; i++) {
			for (String str : strs) {
				if (str.charAt(i) != baseStr.charAt(i)) {
					isPrefEnd = true;
					break;
				}
			}
			if (isPrefEnd) {
				return baseStr.substring(0, i);
			}
			lastIndex = i;
		}
		return baseStr.substring(0, minStrLen);
	}

}
