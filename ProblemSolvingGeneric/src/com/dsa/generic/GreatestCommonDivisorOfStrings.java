package com.dsa.generic;

public class GreatestCommonDivisorOfStrings {

	public static void main(String[] args) {
		String str1 = "ABABAB", str2 = "ABAB";
		String str = getGreatestCommonDivisorOfStrings(str1, str2);
		System.out.println("GreatestCommonDivisorOfStrings : " + str);
	}

	private static String getGreatestCommonDivisorOfStrings(String str1, String str2) {
		if (str1.length() < str2.length()) {
			return getGreatestCommonDivisorOfStrings(str2, str1);
		}

		else if (!str1.startsWith(str2)) {
			return "";
		}

		else if (str2.isEmpty()) {
			return str1;
		} else {
			return getGreatestCommonDivisorOfStrings(str1.substring(str2.length()), str2);
		}
	}

}
