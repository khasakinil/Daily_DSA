package com.dsa.generic.apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 56. Merge Intervals
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * Example 1:
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * Example 2:
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {0, 4}};
        int[][] mergeIntervals = merge(intervals);
    }

    public static int[][] merge(int[][] intervals) {

        Map<Integer, Integer> intervalMap = new LinkedHashMap<>();

        //sort array with 0th location of each internal array
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {

            // check if end is less than or equal to the next start element
            // if so update the end with max of them
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                //put the element in the hashmap and update start and end
                intervalMap.put(start, end);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        intervalMap.put(start, end);

        System.out.println(intervalMap);

        //add hashmap elements into the two dimensional arrays to return
        int[][] result = new int[intervalMap.size()][2];
        int i=0;
        for (Map.Entry<Integer, Integer> entry : intervalMap.entrySet()) {
            result[i][0] = entry.getKey();
            result[i++][1] = entry.getValue();
        }
        return result;
    }
}
