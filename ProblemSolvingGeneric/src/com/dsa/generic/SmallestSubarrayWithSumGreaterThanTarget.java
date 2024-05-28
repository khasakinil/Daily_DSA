package com.dsa.generic;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array arr[] of integers and a number x,
 * the task is to find the smallest subarray with a sum greater than the given value. 
 * The subarray should be in original array sequence only
 * 
 * Example:1
 * arr[] = {1, 4, 45, 6, 0, 19}
 * x  =  51
 * Output: 3
 * Minimum length subarray is {4, 45, 6}
 * arr[] = {1, 10, 5, 2, 7}
 * x  = 9
 * Output: 1
 * Minimum length subarray is {10}
 * 
 * Example:2
 * arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}
 * x = 280
 * Output: 4
 * Minimum length subarray is {100, 1, 0, 200}
 * 
 * Example:3
 * arr[] = {1, 2, 4}
 * x = 8
 * Output : Not Possible
 * Whole array sum is smaller than 8.
 */
public class SmallestSubarrayWithSumGreaterThanTarget {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 2, 4, 3 };
		int target = 7;

		List<Integer> smallestSubarray = getSmallestSubarrayWithSumGreaterThanTarget(arr, target);
		System.out.println("smallestSubarray : " + smallestSubarray);
	}

	private static List<Integer> getSmallestSubarrayWithSumGreaterThanTarget(int[] arr, int target) {
		List<Integer> smallestList = new ArrayList<>();

		
		
		for (int i = 0; i < arr.length; i++) {
			int curr = i;
			int totalSum = 0;
			boolean isSumGreater = false;
			while (curr < arr.length && target > totalSum) {
				totalSum += arr[curr++];
				if (totalSum >= target) {
					isSumGreater = true;
				}
			}

			if (isSumGreater) {
				if (smallestList.size() == 0) {
					for (int j = i; j < curr; j++) {
						smallestList.add(arr[j]);
					}
				} else {
					if (curr - i < smallestList.size()) {
						smallestList.clear();
						for (int j = i; j < curr; j++) {
							smallestList.add(arr[j]);
						}
					}
				}
			}
		}
		return smallestList;
	}

}
