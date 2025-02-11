package com.dsa.generic.apple;

import com.dsa.generic.Candy;

import java.util.*;

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

//Note : The solution needs optimization for the duplicate inner list

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println("Combination Sum : " + combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> combinationSum = new HashSet<>();

        // get the condidates in the set
        Set<Integer> candidateSet = new HashSet<>();
        for (Integer candidate : candidates) {
            candidateSet.add(candidate);
        }

        for (Integer candidate : candidateSet) {
            List<Integer> innerList = new ArrayList<>();
            //check if candidate==targe
            if (candidate == target) {
                //add the candidate in the list
                innerList.add(candidate);
                combinationSum.add(innerList);
            } else {
                //if target is divisible by candidate
                if (target % candidate == 0) {
                    int div = target / candidate;
                    // add candidate in list n times
                    for (int i = 0; i < div; i++) {
                        innerList.add(candidate);
                    }
                    combinationSum.add(innerList);
                } else {
                    int div = target / candidate;
                    if (candidateSet.contains(target - (candidate * div))) {
                        // add candidate in list n times along with (target - (candidate * div))
                        for (int i = 0; i < div; i++) {
                            innerList.add(candidate);
                        }
                        innerList.add(target - (candidate * div));
                        if (innerList.size() > 0) {
                            combinationSum.add(innerList);
                        }
                    } else {
                        //decrement div by 1 and check if (target - (candidate * div)) exists in the set
                        div--;
                        while (div > 0) {
                            if (candidateSet.contains(target - (candidate * div))) {
                                // add candidate in list n times along with (target - (candidate * div))
                                for (int i = 0; i < div; i++) {
                                    innerList.add(candidate);
                                }
                                innerList.add(target - (candidate * div));
                                if (innerList.size() > 0) {
                                    combinationSum.add(innerList);
                                }
                            }
                            div--;
                        }
                    }
                }
            }
        }
        System.out.println(combinationSum);
        return null;
    }
}
