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

		return 0;
	}
}
