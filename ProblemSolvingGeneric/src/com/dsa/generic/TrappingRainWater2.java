package com.dsa.generic;

/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it can trap after raining.
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented 
 * by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 
 * 6 units of rain water (blue section) are being trapped.
 * 
 * The below solution is with O(1) space complexity
 * 
 */

public class TrappingRainWater2 {
	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int waterTrap = getWaterTrapCapacity(array);
		System.out.println("waterTrap : " + waterTrap);
	}

	private static int getWaterTrapCapacity(int[] array) {
		int WaterTrapCap = 0;
		int leftPointer = 0;
		int rightPointer = array.length - 1;
		int leftMaxVal = array[leftPointer];
		int rightMaxVal = array[rightPointer];

		while (leftPointer <= rightPointer) {
			if (leftMaxVal < rightMaxVal) {
				if (array[leftPointer] < Math.min(leftMaxVal, rightPointer)) {
					WaterTrapCap += (Math.min(leftMaxVal, rightPointer) - array[leftPointer]);
				}

				if (leftMaxVal < array[leftPointer]) {
					leftMaxVal = array[leftPointer];
				}
				leftPointer++;

			} else {
				if (array[rightPointer] < Math.min(leftMaxVal, rightPointer)) {
					WaterTrapCap += (Math.min(leftMaxVal, rightPointer) - array[rightPointer]);
				}

				if (rightMaxVal < array[rightPointer]) {
					rightMaxVal = array[rightPointer];
				}
				rightPointer--;
			}
		}

		return WaterTrapCap;
	}
}
