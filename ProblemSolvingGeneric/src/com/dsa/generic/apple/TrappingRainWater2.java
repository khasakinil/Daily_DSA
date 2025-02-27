package com.dsa.generic.apple;

/**
 * Given an m x n integer matrix heightMap representing the height of each unit
 * cell in a 2D elevation map, return the volume of water it can trap after
 * raining. Example 1: Input: heightMap =
 * [[1,4,3,1,3,2],[3,2,1,3,2,4],[2,3,3,2,3,1]] Output: 4 Explanation: After the
 * rain, water is trapped between the blocks. We have two small ponds 1 and 3
 * units trapped. The total volume of water trapped is 4. Example 2: Input:
 * heightMap = [[3,3,3,3,3],[3,2,2,2,3],[3,2,1,2,3],[3,2,2,2,3],[3,3,3,3,3]]
 * Output: 10
 */

public class TrappingRainWater2 {
	public static void main(String[] ags) {
		int[][] heightMap = { { 3, 3, 3, 3, 3 }, { 3, 2, 2, 2, 3 }, { 3, 2, 1, 2, 3 }, { 3, 2, 2, 2, 3 },
				{ 3, 3, 3, 3, 3 } };
		System.out.println("Max water trapped : " + trapRainWater(heightMap));
	}

	public static int trapRainWater(int[][] heightMap) {
		int[][] maxFromLeft = new int[heightMap.length][heightMap[0].length];
		int[][] maxFromRight = new int[heightMap.length][heightMap[0].length];
		int[][] maxFromTop = new int[heightMap.length][heightMap[0].length];
		int[][] maxFromBottom = new int[heightMap.length][heightMap[0].length];
		int waterTrapped = 0;

		// update max from left to right
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < heightMap.length; i++) {
			for (int j = 0; j < heightMap[0].length; j++) {
				if (heightMap[i][j] > maxNum) {
					maxNum = heightMap[i][j];
				}
				maxFromLeft[i][j] = maxNum;
			}
			maxNum = Integer.MIN_VALUE;
		}

		// update max from right to left
		for (int i = heightMap.length - 1; i >= 0; i--) {
			for (int j = heightMap[0].length - 1; j >= 0; j--) {
				if (heightMap[i][j] > maxNum) {
					maxNum = heightMap[i][j];
				}
				maxFromRight[i][j] = maxNum;
			}
			maxNum = Integer.MIN_VALUE;
		}

		// update max from top to bottom
		for (int i = 0; i < heightMap[0].length; i++) {
			for (int j = 0; j < heightMap.length; j++) {
				if (heightMap[j][i] > maxNum) {
					maxNum = heightMap[j][i];
				}
				maxFromTop[j][i] = maxNum;
			}
			maxNum = Integer.MIN_VALUE;
		}

		// update max from bottom top
		for (int i = heightMap[0].length - 1; i >= 0; i--) {
			for (int j = heightMap.length - 1; j >= 0; j--) {
				if (heightMap[j][i] > maxNum) {
					maxNum = heightMap[j][i];
				}
				maxFromBottom[j][i] = maxNum;
			}
			maxNum = Integer.MIN_VALUE;
		}

		int min;
		for (int i = 1; i < heightMap.length-1; i++) {
			for (int j = 1; j < heightMap[0].length-1; j++) {
				min = Math.min(Math.min(maxFromLeft[i][j], maxFromRight[i][j]),
						Math.min(maxFromTop[i][j], maxFromBottom[i][j]));
				if (min > heightMap[i][j]) {
					waterTrapped += (min - heightMap[i][j]);
				}
			}
		}
		return waterTrapped;
	}
}
