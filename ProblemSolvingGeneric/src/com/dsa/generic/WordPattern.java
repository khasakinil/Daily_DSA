package com.dsa.generic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * 
 * Example 1:
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * 
 * Example 2:
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * 
 * Example 3:
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 * 
 */

public class WordPattern {
	public static void main(String[] args) {
		String pattern = "abba", s = "dog cat cat dog";
		List<String> splittedStr = Arrays.asList(s.split(" "));
		boolean isPatternMatches = isPatternMatchesForString(pattern, splittedStr);
		System.out.println("isPatternMatches : " + isPatternMatches);
	}

	private static boolean isPatternMatchesForString(String pattern, List<String> splittedStr) {
		Map<Character, String> CharStrMap = new HashMap<Character, String>();
		for (int i = 0; i < pattern.length(); i++) {
			if (CharStrMap.containsKey(pattern.charAt(i))) {
				if (!CharStrMap.get(pattern.charAt(i)).equals(splittedStr.get(i))) {
					return false;
				}
			} else {
				CharStrMap.put(pattern.charAt(i), splittedStr.get(i));
			}
		}
		return true;
	}
}
