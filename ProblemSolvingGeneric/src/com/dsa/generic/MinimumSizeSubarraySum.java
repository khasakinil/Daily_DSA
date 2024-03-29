package com.dsa.generic;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int target = 7, nums[] = { 2, 3, 1, 2, 4, 3 };
		int minSubArrayLen = getMinSubArrayLen(target, nums);
		System.out.println("minSubArrayLen : " + minSubArrayLen);

	}

	public static int getMinSubArrayLen(int target, int[] nums) {
		int localTarget = 0;
		int requiredElement = 0;
		TreeMap<Integer, Integer> numMap = new TreeMap<>(Collections.reverseOrder());
		for (int i = 0; i < nums.length; i++) {
			numMap.put(nums[i], numMap.getOrDefault(nums[i], 0) + 1);
		}

		for (Map.Entry entry : numMap.entrySet()) {
			for (int i = 0; i < (int) entry.getValue(); i++) {
				if (localTarget < target) {
					localTarget += (int) entry.getKey();
					requiredElement++;
				} else {
					break;
				}
			}
		}
		return localTarget>=target?requiredElement : 0;
	}
}
