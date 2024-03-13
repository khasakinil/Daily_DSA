package com.dsa.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramListFromListOfStrings {
	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "elbow", "ate", "below", "bat" };
		List<List<String>> groupStrs = group(strs);
		System.out.println(groupStrs);
//		Input : { "eat", "tea", "elbow", "ate", "below", "bat" }
//		Output: [["bat"],["below","elbow"],["ate","eat","tea"]]
	}

	private static List<List<String>> group(String[] words) {
		List<List<String>> grpList = new ArrayList<>();
		Map<String, List<String>> strMap = new HashMap<>();
		for (String str : words) {
			List<Character> lChar = new ArrayList<>();
			for (int i = 0; i < str.length(); i++) {
				lChar.add(str.charAt(i));
			}

			Collections.sort(lChar);
			String sortedStr = "";
			for (int i = 0; i < lChar.size(); i++) {
				sortedStr += lChar.get(i);
			}

			if (strMap.containsKey(sortedStr)) {
				List<String> listStr = strMap.get(sortedStr);
				listStr.add(str);
				strMap.put(sortedStr, listStr);
			} else {
				List<String> listStr = new ArrayList<String>();
				listStr.add(str);
				strMap.put(sortedStr, listStr);
			}
		}

		for (Map.Entry entry : strMap.entrySet()) {
			grpList.add((List<String>) entry.getValue());
		}

		grpList = grpList.stream().sorted((l1, l2) -> l1.size() > l2.size() ? 1 : -1).collect(Collectors.toList());
		for (int i = 0; i < grpList.size(); i++) {
			Collections.sort(grpList.get(i));
		}

		return grpList;
	}
}
