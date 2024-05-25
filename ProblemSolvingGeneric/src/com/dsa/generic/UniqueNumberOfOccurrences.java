package com.dsa.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 */

public class UniqueNumberOfOccurrences {
	public static void main(String[] args) {
		int[] input = { 1, 2, 2, 1, 1, 3, 2 };
		boolean hasUniqueOccurrences = hasUniqueNumberOfOccurrences(input);
		System.out.println("hasUniqueOccurrences : " + hasUniqueOccurrences);
	}

	private static boolean hasUniqueNumberOfOccurrences(int[] input) {
		Map<Integer, Integer> numOccurences = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			numOccurences.put(input[i], numOccurences.getOrDefault(input[i], 0) + 1);
		}

		Set<Integer> occurenceSet = new HashSet<>();
		for (Map.Entry entry : numOccurences.entrySet()) {
			if (!occurenceSet.add((Integer) entry.getValue())) {
				return false;
			}
		}
		return true;
	}
}
