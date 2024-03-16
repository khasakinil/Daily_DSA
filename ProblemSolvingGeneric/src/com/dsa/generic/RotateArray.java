package com.dsa.generic;

public class RotateArray {
	public static void main(String args[]) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		getRotatedArray(nums, k);
		System.out.println("Rotated Array : ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static void getRotatedArray(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			int temp = (i + k) > nums.length - 1 ? i : i + k;
			int swapTemp = nums[temp];
			nums[temp] = nums[i];
			nums[i] = swapTemp;
		}
	}
}
