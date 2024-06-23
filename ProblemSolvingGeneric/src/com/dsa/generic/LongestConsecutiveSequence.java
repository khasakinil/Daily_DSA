package com.dsa.generic;

import java.util.Set;
import java.util.TreeSet;

/*
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * 
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * 
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * 
 * Problem Solving Approach : 
 * 1. Sort the given array using TreeSet
 * 2. Check everytime whether the start number seequence exists or not
 * 	-> if exists increment counter else set counter to 1
 * 3. Check current sequence counter with previous counter and update longestConsecutiveSequence
 */
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };
		System.out.println("LongestConsecutiveSequence Length : " + longestConsecutive(nums));
	}

	public static int longestConsecutive(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}

		int longestConsecutiveSequence = 1, currentConsecutiveSequence = 1;

		Set<Integer> numsSet = getSortedSet(nums);

		for (Integer num : numsSet) {
			if (numsSet.contains(num - 1)) {
				currentConsecutiveSequence++;
			} else {
				currentConsecutiveSequence = 1;
			}

			if (currentConsecutiveSequence > longestConsecutiveSequence) {
				longestConsecutiveSequence = currentConsecutiveSequence;
			}
		}

		return longestConsecutiveSequence;
	}

	private static Set<Integer> getSortedSet(int[] nums) {
		Set<Integer> numsSet = new TreeSet<>();
		for (int num : nums) {
			numsSet.add(num);
		}
		return numsSet;
	}
}
