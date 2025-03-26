package com.dsa.generic.apple;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "1flower", "flow", "flight" };
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
		}
		return baseStr;
	}

}
