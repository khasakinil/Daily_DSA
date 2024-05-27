package com.dsa.generic;

/*
 * find second minimum element in array
 * 
 */
public class SecondMinimumElementInArray {

	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 4, 12, 9, 7 };
		int secondSmallestNum = getSecondMinimumElementInArray(array);
		System.out.println("secondSmallestNum : " + secondSmallestNum);
	}

	private static int getSecondMinimumElementInArray(int[] array) {
		int smallestNum = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallestNum) {
				secondSmallest = smallestNum;
				smallestNum = array[i];
			} else if (array[i] < secondSmallest) {
				secondSmallest = array[i];
			}
		}

		return secondSmallest;
	}

}
