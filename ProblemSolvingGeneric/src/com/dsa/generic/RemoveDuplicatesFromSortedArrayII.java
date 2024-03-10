package com.dsa.generic;

/*
 * Remove Duplicates from Sorted Array II
 * Given an integer array nums sorted in non-decreasing order, 
 * remove some duplicates in-place such that each unique element appears at most twice. 
 * The relative order of the elements should be kept the same.
 * Return k after placing the final result in the first k slots of nums.
 */

public class RemoveDuplicatesFromSortedArrayII {
	public static void main(String args[]) {
		RemoveDuplicatesFromSortedArrayII remDup = new RemoveDuplicatesFromSortedArrayII();
		int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		// 1,1,1,2,2,3
		// 0, 0, 1, 1, 1, 1, 2, 3, 3
		int uniqueNumbers = remDup.removeDuplicatesFromSortedArray(nums);
		System.out.println("Unique Numbers : " + uniqueNumbers);
		for (int i = 0; i < uniqueNumbers; i++) {
			System.out.println(nums[i]);
		}
	}

	private int removeDuplicatesFromSortedArray(int[] nums) {
		int uniqueCount = 0;
		int i = 0;
		int count = 1;
		while (i < nums.length && uniqueCount < nums.length) {
			if (nums[uniqueCount] == nums[i] && count < 2) {
				nums[++uniqueCount] = nums[i];
				count++;
				i++;
				continue;
			} else if (nums[uniqueCount] == nums[i] && count >= 2) {
				i++;
				continue;
			}

			if (nums[uniqueCount] != nums[i]) {
				nums[++uniqueCount] = nums[i];
				count = 1;
			}
			i++;
		}
		return uniqueCount + 1;
	}
}
