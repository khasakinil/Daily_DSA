package com.dsa.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given two strings ransomNote and magazine, 
 * return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 * 
 * Example 1:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: false
 * 
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * 
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "a", magazine = "b";
		boolean isRansomNotePossible = isRansomNote(ransomNote, magazine);
		System.out.println("isRansomNotePossible : " + isRansomNotePossible);
	}

	private static boolean isRansomNote(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) {
			return false;
		}

		Map<Character, Integer> ransomMap = new HashMap<Character, Integer>();
		Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();

		for (int i = 0; i < ransomNote.length(); i++) {
			ransomMap.put(ransomNote.charAt(i), ransomMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
		}

		for (int i = 0; i < magazine.length(); i++) {
			magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
		}

		for (Map.Entry entry : ransomMap.entrySet()) {
			if (!(magazineMap.containsKey(entry.getKey())
					&& (int) entry.getValue() <= magazineMap.get(entry.getKey()))) {
				return false;
			}
		}
		return true;
	}

}
