package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;
/*
 * leetcode : 169. Majority Element
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than [n / 2] times. 
 * You may assume that the majority element always exists in the array.
 * Example 1:
 *	
 *	Input: nums = [3,2,3]
 *	Output: 3
 *	Example 2:
 *	
 *	Input: nums = [2,2,1,1,1,2,2]
 *	Output: 2
 */
public class MajorityElement {
	public static void main(String args[]) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		int majorityElement = getMejorityElement(nums);
		System.out.println("Majority Element : " + majorityElement);
	}

	private static int getMejorityElement(int[] nums) {
		Map<Integer, Integer> majorityMap = new HashMap<>();
		int majorityValue = 0;
		int majorityElement = 0;
		for (int i = 0; i < nums.length; i++) {
			majorityMap.put(nums[i], majorityMap.getOrDefault(nums[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : majorityMap.entrySet()) {
			if ((int) entry.getValue() > majorityValue) {
				majorityValue = (int) entry.getValue();
				majorityElement = (int) entry.getKey();
			}
		}
		return majorityElement;
	}
}
