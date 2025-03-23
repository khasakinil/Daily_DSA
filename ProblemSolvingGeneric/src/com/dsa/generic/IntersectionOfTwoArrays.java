package com.dsa.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must be unique and you may return the result in any order.
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */
public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1}, nums2 = {2,2};
		int[] result = intersection(nums1, nums2);
		printIntersection(result);
	}

	private static void printIntersection(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> intesectionList = new HashSet<>();
		Set<Integer> nums1Set= new HashSet<>();
		for(int i=0; i<nums1.length; i++) {
			nums1Set.add(nums1[i]);
		}
		
		for(int i=0; i<nums2.length; i++) {
			if(nums1Set.contains(nums2[i])) {
				intesectionList.add(nums2[i]);
			}
		}
		
		return intesectionList.stream().mapToInt(i -> i).toArray();
	}
}
