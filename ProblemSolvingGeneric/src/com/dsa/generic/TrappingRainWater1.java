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
 * The below solution is with O(n) space complexity
 * 
 */

public class TrappingRainWater1 {
	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int waterTrap = getWaterTrapCapacity(array);
		System.out.println("waterTrap : " + waterTrap);
	}

	private static int getWaterTrapCapacity(int[] array) {
		int WaterTrapCap = 0;
		int[] maxFromLeft = new int[array.length];
		int[] maxFromRight = new int[array.length];
		int[] minArray = new int[array.length];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			maxFromLeft[i] = max;
		}

		max = Integer.MIN_VALUE;
		for (int i = array.length - 1; i >= 0; i--) {
			if (max < array[i]) {
				max = array[i];
			}
			maxFromRight[i] = max;
		}

		for (int i = 0; i < maxFromLeft.length; i++) {
			minArray[i] = Math.min(maxFromLeft[i], maxFromRight[i]);
		}

		for (int i = 0; i < array.length; i++) {
			if (minArray[i] - array[i] > 0) {
				WaterTrapCap += (minArray[i] - array[i]);
			}
		}

		return WaterTrapCap;
	}
}
