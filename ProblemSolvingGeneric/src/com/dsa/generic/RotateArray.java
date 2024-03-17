package com.dsa.generic;

public class RotateArray {
	public static void main(String args[]) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		int[] rotatedArr = getRotatedArray(nums, k + 1);
		System.out.println("Rotated Array : ");
		for (int i = 0; i < rotatedArr.length; i++) {
			System.out.print(rotatedArr[i] + " ");
		}
	}

	private static int[] getRotatedArray(int[] nums, int k) {
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
