package com.dsa.generic;

/*
 * Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
 * 
 * Example 1:
 * Input:
 * S = i.like.this.program.very.much
 * Output: much.very.program.this.like.i
 * Explanation: After reversing the whole
 * string(not individual words), the input
 * string becomes
 * much.very.program.this.like.i
 *
 */

public class ReverseWordsInGivenString {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		String reversedWords = getReverseWordsInGivenString(str);
		System.out.println("reversedWords : " + reversedWords);
	}

	private static String getReverseWordsInGivenString(String str) {
		String[] splitedStr = str.split("\\.");
		StringBuilder sb = new StringBuilder();
		for (int i = splitedStr.length - 1; i >= 0; i--) {
			sb.append(splitedStr[i]);
			if (i != 0) {
				sb.append('.');
			}
		}
		return sb.toString();
	}

}
