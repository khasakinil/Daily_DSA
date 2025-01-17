package com.dsa.generic.apple;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 * <p>
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println("Median of two sorted arrays : " + findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums1){
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
            if(maxHeap.size()<minHeap.size()){
                maxHeap.add(minHeap.poll());
            }
        }

        for(int num : nums2){
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
            if(maxHeap.size()<minHeap.size()){
                maxHeap.add(minHeap.poll());
            }
        }

        if(maxHeap.isEmpty()){
            return 0;
        }
        return maxHeap.size()>minHeap.size()?maxHeap.peek():(double)(minHeap.peek()+maxHeap.peek())/2;
    }
}
