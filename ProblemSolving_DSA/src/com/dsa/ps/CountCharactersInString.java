package com.dsa.ps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharactersInString {
	public static void main(String args[]) {
		String str = "Good Morning Everyone";
		countCharsInString(str);
	}

	private static void countCharsInString(String str) {
		Map<Character, Integer> charCount = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			charCount.put(str.charAt(i), charCount.getOrDefault(str.charAt(i), 0) + 1);
		}

		for (Entry<Character, Integer> entry : charCount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
