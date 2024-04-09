package com.dsa.generic;

public class LongestCommonPrefix {
	public static void main(String args[]) {
		String[] strs = { "flower", "flow", "flight" };
		String longestPrefix = longestCommonPrefix(strs);
		System.out.println("longestPrefix : " + longestPrefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		String commonPrefix = "";
		int j = 0;
		if(strs.length == 0) {
			commonPrefix = strs[0];
		}
		while (true && strs.length>1) {
			boolean needToBreak = false;
			for (int i = 1; i < strs.length; i++) {
				if (strs[i].length() > 0 && strs[i - 1].length() > 0) {
					if (j >= strs[i].length() || strs[i - 1].charAt(j) != strs[i].charAt(j)) {
						needToBreak = true;
						break;
					}
				}
			}
			if (needToBreak) {
				break;
			} else {
				commonPrefix += strs[0].charAt(j);
			}
			j++;
		}
		return commonPrefix;
	}
}
