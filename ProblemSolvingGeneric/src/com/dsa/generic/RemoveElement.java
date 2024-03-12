package com.dsa.generic;

/*
 * Given an integer array nums and an integer val, 
 * remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. 
 * Then return the number of elements in nums which are not equal to val.
 */
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = { 3,2,2,3 };
		int val = 3;
		int expectedNums = keepExpectedNumsAndRemoveElement(nums, val);
		System.out.println("expectedNums : " + expectedNums);
	}

	private static int keepExpectedNumsAndRemoveElement(int[] nums, int val) {

		int frontPointer = 0;
		int backPointer = nums.length - 1;

		for (int i = 0; i < nums.length; i++) {
			if (i >= backPointer) {
				frontPointer = i > backPointer ? i - 1 : i;
				break;
			}
			if (nums[i] == val) {
				backPointer = getBackPointerIndex(backPointer, val, nums);
				if (backPointer > i) {
					int temp = nums[i];
					nums[i] = nums[backPointer];
					nums[backPointer] = temp;
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		return frontPointer;
	}

	private static int getBackPointerIndex(int backPointer, int val, int[] nums) {
		while (backPointer >= 0) {
			if (nums[backPointer] != val) {
				return backPointer;
			}
			backPointer--;
		}
		return 0;
	}
}
