package com.dsa.generic;

/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same. Since it is impossible to change the length of the array in some languages, 
 * you must instead have the result be placed in the first part of the arr
 */
public class RemoveDuplicatesFromSortedArray1 {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int uniqueNumbers = removeDuplicatesFromSortedArray(nums, 1);
		System.out.println("\nTotal Unique Numbers : " + uniqueNumbers);
	}

	private static int removeDuplicatesFromSortedArray(int[] nums, int k) {
		int n = nums.length;
		if (n == 0) {
			return n;
		}

		int i = 0, uniqueCount = 0;
		while (i < nums.length) {
			if (nums[uniqueCount] != nums[i]) {
				nums[++uniqueCount] = nums[i];
			}
			i++;
		}
		
		i = uniqueCount;
		while (uniqueCount < nums.length - 1) {
			nums[++uniqueCount] = Integer.MIN_VALUE;
		}

		System.out.println("Unique List : ");
		for (int j = 0; j < nums.length; j++) {
			System.out.print(nums[j] + " ");
		}

		return i + 1;
	}

}
