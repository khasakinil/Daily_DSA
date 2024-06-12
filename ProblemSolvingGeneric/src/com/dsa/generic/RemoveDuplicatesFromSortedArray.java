package com.dsa.generic;

/*
 * Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, 
 * remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same. 
 * Then return the number of unique elements in nums.
 */

public class RemoveDuplicatesFromSortedArray {
	public static void main(String args[]) {
		RemoveDuplicatesFromSortedArray remDup = new RemoveDuplicatesFromSortedArray();
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int uniqueNumbers = remDup.removeDuplicatesFromSortedArray(nums);
		System.out.println("Unique Numbers : " + uniqueNumbers);
	}

	private int removeDuplicatesFromSortedArray(int[] nums) {
		int uniqueCount = 0;
		int i = 1;
		while (i < nums.length) {
			if (nums[uniqueCount] != nums[i]) {
				nums[++uniqueCount] = nums[i];
			}
			i++;
		}

		for (int j = 0; j < nums.length; j++) {
			System.out.print(nums[j] + " ");
		}
		return uniqueCount + 1;
	}
}
