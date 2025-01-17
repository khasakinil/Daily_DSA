package com.dsa.generic.apple;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 * <p>
 * Example 1:
 * <p>
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 * <p>
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 */

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped Water : " + trap(height));
    }

    public static int trap(int[] height) {
        int[] maxHeightFromLeft = new int[height.length];
        int[] maxHeightFromRight = new int[height.length];
        int maxWaterTrap = 0;

        int maxHeight = Integer.MIN_VALUE;
        //get max height from left
        for(int i=0; i<height.length;i++){
            maxHeight = Math.max(maxHeight, height[i]);
            maxHeightFromLeft[i] = maxHeight;
        }

        //get max height from right
        maxHeight = 0;
        for(int i=height.length-1; i>=0; i--){
            maxHeight = Math.max(maxHeight, height[i]);
            maxHeightFromRight[i] = maxHeight;
        }

        //compute water trap on each index by -> Math.min(maxHeightFromLeftAtIndex, maxHeightFromRightAtIndex) - currentHeightAtIndex
        for(int i=0; i<height.length; i++){
            maxWaterTrap += Math.min(maxHeightFromLeft[i], maxHeightFromRight[i]) - height[i];
        }

        return maxWaterTrap;
    }
}
