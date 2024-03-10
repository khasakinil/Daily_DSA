package com.dsa.generic;

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
		return uniqueCount + 1;
	}
}
