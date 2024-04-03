package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * 
 * Input: s = "rat", t = "car"
 * Output: false
 */

public class ValidAnagram {
	public static void main(String args[]) {
		String s = "rat", t = "car";
		boolean validAnagram = isValidAnagram(s, t);
		System.out.println("validAnagram : " + validAnagram);
	}

	private static boolean isValidAnagram(String s, String t) {
		Map<Character, Integer> firstMap = new HashMap<Character, Integer>();
		Map<Character, Integer> secondMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			firstMap.put(s.charAt(i), firstMap.getOrDefault(s.charAt(i), 0) + 1);
		}

		for (int i = 0; i < t.length(); i++) {
			secondMap.put(t.charAt(i), secondMap.getOrDefault(t.charAt(i), 0) + 1);
		}

		if (firstMap.size() != secondMap.size()) {
			return false;
		}

		for (Map.Entry entry : firstMap.entrySet()) {
			if (entry.getValue() != secondMap.get(entry.getKey())) {
				return false;
			}
		}
		return true;
	}
}
