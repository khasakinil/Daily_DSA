package com.dsa.generic;

public class RecursiveDigitSum {

	public static void main(String[] args) {
		String str = "1234";
		System.out.println(superDigit(str, 0));

	}

	public static int superDigit(String n, int k) {
		if (n.length() == 0) {
			return k;
		} else {
			return superDigit(n.substring(0, n.length() - 1), k + Integer.parseInt("" + n.charAt(n.length() - 1)));
		}
	}
}
