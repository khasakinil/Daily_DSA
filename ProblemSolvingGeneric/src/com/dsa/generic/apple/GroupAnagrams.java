package com.dsa.generic.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49. Group Anagrams 
 * Given an array of strings strs, group the anagrams together. 
 * You can return the answer in any order. 
 * Example 1: Input: strs =["eat","tea","tan","ate","nat","bat"] 
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]] 
 * Explanation: There is no string in strs that can be rearranged to form "bat". 
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other. 
 * The strings "ate","eat", and "tea" are anagrams as they can be rearranged to form each other.
 * Example 2: Input: strs = [""] Output: [[""]] 
 * Example 3: Input: strs = ["a"]
 * Output: [["a"]]
 */
public class GroupAnagrams {

	public static void main(String args[]) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println("groupAnagrams : " + groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, ArrayList<String>> strMap = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String strSort = getSortedStr(strs[i]);
			if (strMap.containsKey(strSort)) {
				ArrayList<String> arrayList = strMap.get(strSort);
				arrayList.add(strs[i]);
			} else {
				ArrayList<String> arrayList = new ArrayList<>();
				arrayList.add(strs[i]);
				strMap.put(strSort, arrayList);
			}
		}

		List<List<String>> anagramList = new ArrayList<>();
		for (Map.Entry<String, ArrayList<String>> entry : strMap.entrySet()) {
			anagramList.add(entry.getValue());
		}

		return anagramList;
	}

	private static String getSortedStr(String str) {
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);
	}
}
