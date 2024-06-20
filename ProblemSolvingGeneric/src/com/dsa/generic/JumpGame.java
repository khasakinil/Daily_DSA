package com.dsa.generic;

/*
 * You are given an integer array nums. You are initially positioned at the array's first index, 
 * and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 * Example 1:
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * 
 * Example 2:
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. 
 * Its maximum jump length is 0, which makes it impossible to reach the last index.
 * 
 * Solving Approach:
 * 
 * 1. Iterate all jumps
 * 2. In Each iteration update the reachable index
 * 3. if (reachable < i) {
 * 		return false;
 * 	  }
 * 4. in every iteration update the reachable with
 * 		if (reachable < i + nums[i]) {
 * 			reachable = i + nums[i];
 * 		}
 * 
 */
public class JumpGame {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 0 };
		System.out.println("Can reach the last Index : " + canJump(nums));
	}

	public static boolean canJump(int[] nums) {

		int reachable = 0;
		int numsLength = nums.length;
		for (int i = 0; i < numsLength; i++) {
			if (reachable < i) {
				return false;
			}
			if (reachable < i + nums[i]) {
				reachable = i + nums[i];
			}
		}

		return true;
	}

}
