package com.dsa.generic;

public class ReverseStringWithWordSizeInForwardDirection {

	public static void main(String[] args) {
		String str = "Hello Today is Awesome Day";
		int revPointer = str.length() - 1;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (str.charAt(revPointer) == ' ') {
					revPointer--;
				}
				sb.append(str.charAt(revPointer--));
			} else {
				sb.append(' ');
			}
		}
		System.out.println(sb.toString());
	}

}
