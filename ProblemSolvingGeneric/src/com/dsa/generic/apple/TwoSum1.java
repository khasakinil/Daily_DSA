package com.dsa.generic.apple;

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
//Note : Leetcode accepted solution.

public class TwoSum1 {

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
		Map<Integer, Integer> numDupMap = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			if(numMap.containsKey(numbers[i])){
				numDupMap.put(numbers[i], i);
			}else{
				numMap.put(numbers[i], i);
			}
		}

		for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
			if (numMap.containsKey(target - entry.getKey())) {
				int firstIndex = entry.getValue();
				int secondIndex;

				if(numDupMap.containsKey(entry.getKey())){
					secondIndex = numDupMap.get(entry.getKey());
				}else{
					secondIndex = numMap.get(target-entry.getKey());
				}
				return new int[]{firstIndex, secondIndex};
			}
		}
		return null;
	}
}
