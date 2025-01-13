package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
 * find two numbers such that they add up to a specific target number. 
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * 
 * Example 1:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * 
 * Example 2:
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 * 
 */

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = { 3, 3 };
		int target = 6;
		int[] twoSumIndex = getTwoSumIndex(numbers, target);
		System.out.println("twoSumIndex : ");
		for (int i = 0; i < twoSumIndex.length; i++) {
			System.out.print(twoSumIndex[i] + " ");
		}
	}

	private static int[] getTwoSumIndex(int[] numbers, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			numMap.put(numbers[i], i + 1);
		}

		for (Map.Entry entry : numMap.entrySet()) {
			if (numMap.containsKey(target - (int) entry.getKey())) {
				int firstElement = (int) entry.getValue();
				if ((int) entry.getValue() == numMap.get(target - (int) entry.getKey())) {
					for (int i = 0; i < numbers.length; i++) {
						if ((int) entry.getKey() == numbers[i]) {
							firstElement = i + 1;
							break;
						}
					}
				}

				int out[] = {
						firstElement < numMap.get(target - (int) entry.getKey()) ? firstElement-1
								: numMap.get(target - (int) entry.getKey())-1,
						numMap.get(target - (int) entry.getKey()) > firstElement
								? numMap.get(target - (int) entry.getKey())-1
								: firstElement-1 };
				return out;
			}
		}
		return null;
	}

}
