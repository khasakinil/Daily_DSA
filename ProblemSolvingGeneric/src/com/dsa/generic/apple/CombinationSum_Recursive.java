package com.dsa.generic.apple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 39. Combination Sum
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
 * frequency
 * of at least one of the chosen numbers is different.
 * The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 * Example 2:
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 * Example 3:
 * Input: candidates = [2], target = 1
 * Output: []
 */

// Note : The solution needs optimization for the duplicate inner list

public class CombinationSum_Recursive {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println("Combination Sum : " + combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinationSum = new ArrayList<>();
        combinationSumRecursive(candidates, 0, target, new ArrayList<>(), combinationSum);
        return combinationSum;
    }

    private static void combinationSumRecursive(int[] candidates, int start, int target, ArrayList<Integer> list, List<List<Integer>> combinationSum) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinationSum.add(new ArrayList<>(list));
        }

        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            combinationSumRecursive(candidates, i, target - candidates[i], list, combinationSum);
            list.remove(list.size() - 1);
        }
    }
}
