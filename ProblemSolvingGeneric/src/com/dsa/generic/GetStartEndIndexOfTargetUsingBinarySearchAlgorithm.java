package com.dsa.generic;

public class GetStartEndIndexOfTargetUsingBinarySearchAlgorithm {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 6 };
		int target = 3;
		int[] targetOutput = getTarget(arr, target);
		for (int i = 0; i < targetOutput.length; i++) {
			System.out.print(targetOutput[i] + ", ");
		}
	}

	private static int[] getTarget(int[] arr, int target) {

		int start = 0, end = arr.length, mid = arr.length / 2;
		int targetStart = getStartOfTarget(arr, target, start, end, mid);
		if (targetStart == -1) {
			int[] rtrArr = { -1, -1 };
			return rtrArr;
		} else {
			int startVal = targetStart;
			int endVal = targetStart;
			for (int i = targetStart - 1; i >= 0; i--) {
				if (arr[i] == target) {
					startVal = i;
				} else {
					break;
				}
			}
			for (int i = targetStart + 1; i < arr.length; i++) {
				if (arr[i] == target) {
					endVal = i;
				} else {
					break;
				}
			}
			int[] rtrArr = { startVal, endVal };
			return rtrArr;
		}
	}

	private static int getStartOfTarget(int[] arr, int target, int start, int end, int mid) {
		if (target < arr[start] || target > arr[end - 1]) {
			return -1;
		}
		if (arr[mid] == target) {
			return mid;
		} else if (target < arr[mid]) {
			return getStartOfTarget(arr, target, start, mid, (start + mid) / 2);
		} else if (target > arr[mid]) {
			return getStartOfTarget(arr, target, mid, end, (end + mid) / 2);
		} else {
			return -1;
		}
	}
}
