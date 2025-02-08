package com.dsa.generic.apple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 315. Count of Smaller Numbers After Self
 * Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].
 * Example 1:
 * Input: nums = [5,2,6,1]
 * Output: [2,1,1,0]
 * Explanation:
 * To the right of 5 there are 2 smaller elements (2 and 1).
 * To the right of 2 there is only 1 smaller element (1).
 * To the right of 6 there is 1 smaller element (1).
 * To the right of 1 there is 0 smaller element.
 * Example 2:
 * Input: nums = [-1]
 * Output: [0]
 * Example 3:
 * Input: nums = [-1,-1]
 * Output: [0,0]
 */
public class CountOfSmallerNumbersAfterSelf {

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        System.out.println("Count Of Smaller Numbers After Self : " + countSmaller(nums));
    }

    public static List<Integer> countSmaller(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> dupMap = new HashMap<>();
        List<Integer> smallerNumbers = new ArrayList<>();

        int smallNumCount = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int current = i;
//            int prev = current;
            for (int j = i; j < nums.length - 1; j++) {
//                prev = nums[j];
                if (nums[current] > nums[j + 1]) {
                    smallNumCount = 1 + map.get(j + 1);
                    break;
                }
//                else if (prev == nums[j + 1]) {
//                    dupMap.put(prev, dupMap.getOrDefault(dupMap.get(prev), 0) + 1);
//                }
            }
//            if(nums[i]!=prev) {
//                map.put(i, smallNumCount + dupMap.getOrDefault(prev, 0));
//            }else{
//                map.put(i, smallNumCount);
//            }
            map.put(i, smallNumCount);
            smallNumCount = 0;
        }

        int i = 0;
        while (i < map.size()) {
            smallerNumbers.add(map.get(i++));
        }

        return smallerNumbers;
    }
}
