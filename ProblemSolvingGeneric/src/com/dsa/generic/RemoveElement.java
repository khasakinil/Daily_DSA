package com.dsa.generic;

/*
 * Given an integer array nums and an integer val, 
 * remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. 
 * Then return the number of elements in nums which are not equal to val.
 */
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int expectedNums = keepExpectedNumsAndRemoveElement(nums, val);
		System.out.println("expectedNums : " + expectedNums);
	}

	private static int keepExpectedNumsAndRemoveElement(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count++] = nums[i];
			}
		}
		return count;
	}
}
