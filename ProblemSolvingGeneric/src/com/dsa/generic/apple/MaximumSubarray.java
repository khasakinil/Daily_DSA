package com.dsa.generic.apple;

/**
 * Given an integer array nums, find the
 * subarray
 * with the largest sum, and return its sum.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.
 * Example 3:
 * <p>
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Subarray with largest sum : " + maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int allSum = 0;
        int currentSum = 0;
        int maxSum = 0;
        int currentMax = Integer.MIN_VALUE;

        for (int num : nums) {
            allSum += num;
            currentSum += num;

            //in case of negative max number to maintain
            if (currentMax < currentSum) {
                currentMax = currentSum;
            }

            //currentsum should start with the 0
            if (currentSum < 0) {
                currentSum = 0;
            }

            //check for the the max sum value and update
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum > allSum ? (maxSum == 0 ? currentMax : maxSum) : allSum;
    }
}
