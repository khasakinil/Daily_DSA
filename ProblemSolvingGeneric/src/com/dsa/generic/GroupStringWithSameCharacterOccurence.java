package com.dsa.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Group words with same set of characters - 
 * Given a list of words with lower cases. Implement a function to find all Words that have the same unique character set. 
 * 
 * Input : { "may", "student", "students", "dog", "studentssess", "god", "cat", "act", "tab", "bat",
 * 				"flow", "wolf", "lambs", "amy", "yam", "balms", "looped", "poodle" };
 * 			
 * Output : 
 * [studentssess] 
 * [students]
 * [tab, bat]
 * [student]
 * [cat, act]
 * [looped, poodle]
 * [lambs, balms]
 * [may, amy, yam]
 * [dog, god]
 * [flow, wolf]
 */

public class GroupStringWithSameCharacterOccurence {
	public static void main(String[] args) {
		String strArr[] = { "may", "student", "students", "dog", "studentssess", "god", "cat", "act", "tab", "bat",
				"flow", "wolf", "lambs", "amy", "yam", "balms", "looped", "poodle" };

		Map<String, List<String>> groupStr = new HashMap<>();

		for (int i = 0; i < strArr.length; i++) {
			String keyStr = sortedStr(strArr[i]);
			if (groupStr.containsKey(keyStr)) {
				ArrayList<String> extnListForGrp = (ArrayList<String>) groupStr.get(keyStr);
				extnListForGrp.add(strArr[i]);
				groupStr.put(keyStr, extnListForGrp);
			} else {
				List<String> strList = new ArrayList<String>();
				strList.add(strArr[i]);
				groupStr.put(keyStr, strList);
			}
		}

		for (Map.Entry<String, List<String>> map : groupStr.entrySet()) {
			System.out.println(map.getValue());
		}
	}

	private static String sortedStr(String str) {
		char tempArray[] = str.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}
}
