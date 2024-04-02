package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * 
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * 
 */

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };
		int singleNum = getSingleNumber(nums);
		System.out.println("SingleNum : " + singleNum);
	}

	private static int getSingleNumber(int[] nums) {
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			numMap.put(nums[i], numMap.getOrDefault(nums[i], 0) + 1);
		}

		for (Map.Entry entry : numMap.entrySet()) {
			if ((int) entry.getValue() == 1) {
				return (int) entry.getKey();
			}
		}

		return 0;
	}

}
