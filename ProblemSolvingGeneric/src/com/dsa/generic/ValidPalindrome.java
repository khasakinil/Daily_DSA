package com.dsa.generic;

/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters, it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
	public static void main(String[] args) {
		String s = s = "aa";
		boolean isPalindrome = isPalindromeString(s);
		System.out.println("IsPalindrome : " + isPalindrome);
	}

	public static boolean isPalindromeString(String s) {
		s = s.replaceAll("[^\\p{L}\\p{Z}]", "").replace(" ", "").toLowerCase();
		if (s.length() == 0) {
			return true;
		}
		int i = 0, j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
