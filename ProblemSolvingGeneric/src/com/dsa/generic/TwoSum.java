package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = { -1,0 };
		int target = -1;
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
			if (numMap.containsKey(entry.getKey()) && numMap.containsKey(target - (int) entry.getKey())) {
				int out[] = { (int) entry.getValue(), numMap.get(target - (int) entry.getKey()) };
				return out;
			}
		}
		return null;
	}

}
