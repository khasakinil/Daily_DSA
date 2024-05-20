package com.dsa.generic;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {
	public static void main(String args[]) {
		int[] arr = { 12, 5, 7, 1, 8, 4, 3 };

		int target = 9;
		boolean isTargetExist = false;
		int actualStartIndex = 0;
		int actualLastIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			int currItrCount = 0;
			actualStartIndex = i;
			actualLastIndex = 0;
			for (int j = i; j < arr.length; j++) {
				currItrCount += arr[j];
				if (currItrCount == target) {
					actualLastIndex = j;
					isTargetExist = true;
				}
				if (currItrCount > target || isTargetExist) {
					break;
				}
			}
			if (isTargetExist) {
				break;
			}
		}

		List<Integer> subLis = new ArrayList<Integer>();
		if (isTargetExist) {
			for (int i = actualStartIndex; i <= actualLastIndex; i++) {
				subLis.add(arr[i]);
			}
		}
		System.out.println(subLis);
	}
}
