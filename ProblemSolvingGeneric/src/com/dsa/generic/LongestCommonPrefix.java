package com.dsa.generic;

public class LongestCommonPrefix {
	public static void main(String args[]) {
		String[] strs = { "flower", "flow", "flight" };
		String longestPrefix = longestCommonPrefix(strs);
		System.out.println("longestPrefix : " + longestPrefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		String commonPrefix = "";
		for(int i=0; i<strs.length; i++) {
			for(int j=i+1; j<strs[i].length(); j++) {
				
			}
		}
		
		return commonPrefix;
	}
}
