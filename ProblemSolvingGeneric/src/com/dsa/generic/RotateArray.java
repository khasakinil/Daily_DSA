package com.dsa.generic;

public class RotateArray {
	public static void main(String args[]) {
		int[] nums = { 1, 2 };
		int k = 3;

		int[] rotatedArr = getRotatedArray(nums, k);
		System.out.println("Rotated Array : ");
		for (int i = 0; i < rotatedArr.length; i++) {
			System.out.print(rotatedArr[i] + " ");
		}
	}

	private static int[] getRotatedArray(int[] nums, int k) {
		k = k % nums.length;
		if (k > nums.length) {
			k = k / nums.length;
		}

		int[] rotateArr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (k >= nums.length) {
				k = 0;
			}
			rotateArr[k++] = nums[i];
		}
		return rotateArr;
	}
}
