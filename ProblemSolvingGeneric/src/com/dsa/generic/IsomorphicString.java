package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. 
 * No two characters may map to the same character, but a character may map to itself.
 *
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 */

public class IsomorphicString {

	public static void main(String[] args) {
		String s = "badc", t = "baba";
		boolean isIsomorphic = isomorphicString(s, t);
		System.out.println("IsomorphicString : " + isIsomorphic);
	}

	private static boolean isomorphicString(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> charMap1 = new HashMap<Character, Character>();
		Map<Character, Character> charMap2 = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			if (charMap1.containsKey(s.charAt(i))) {
				if (charMap1.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			} else {
				charMap1.put(s.charAt(i), t.charAt(i));
			}

		}

		for (int i = 0; i < t.length(); i++) {
			if (charMap2.containsKey(t.charAt(i))) {
				if (charMap2.get(t.charAt(i)) != s.charAt(i)) {
					return false;
				}
			} else {
				charMap2.put(t.charAt(i), s.charAt(i));
			}

		}

		return true;
	}
}
