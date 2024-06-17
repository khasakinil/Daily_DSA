package com.dsa.generic;

/*
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * You are giving candies to these children subjected to the following requirements:
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 * 
 * Example 1:
 * Input: ratings = [1,0,2]
 * Output: 5
 * Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
 * 
 * Example 2:
 * Input: ratings = [1,2,2]
 * Output: 4
 * Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
 * The third child gets 1 candy because it satisfies the above two conditions.
 * 
 * Solving Approach:
 *	1. Initialize candyValues arrays with 1 value for each index
 *	2. iterate from left to right
 *		if (ratings[i - 1] < ratings[i]) {
 *			candyValues[i] = candyValues[i - 1] + 1;
 *		}
 *	3. Iterate from right to left
 *		if (ratings[i] < ratings[i - 1]) {
 *			candyValues[i - 1] = candyValues[i] + 1;
 *		}
 *	4. Sum all the candyValues and return it.
 *
 */
public class Candy {

	public static void main(String[] args) {
		int[] ratings = { 1, 3, 4, 5, 2 };
		int minumumCandiesNeeded = candy(ratings);
		System.out.println("\nMinumumCandiesNeeded : " + minumumCandiesNeeded);
	}

	public static int candy(int[] ratings) {
		int totalCandy = 0;
		int[] candyValues = new int[ratings.length];

		for (int i = 0; i < ratings.length; i++) {
			candyValues[i] = 1;
		}

		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i - 1] < ratings[i] && candyValues[i] <= candyValues[i - 1]) {
				candyValues[i] = candyValues[i - 1] + 1;
			}
		}

		printCandyValues(candyValues);

		for (int i = ratings.length - 1; i > 0; i--) {
			if (ratings[i] < ratings[i - 1] && candyValues[i - 1] <= candyValues[i]) {
				candyValues[i - 1] = candyValues[i] + 1;
			}
		}

		printCandyValues(candyValues);

		for (int i = 0; i < candyValues.length; i++) {
			totalCandy += candyValues[i];
		}
		return totalCandy;
	}

	private static void printCandyValues(int[] candyValues) {
		System.out.println();
		for (int i = 0; i < candyValues.length; i++) {
			System.out.print(candyValues[i] + " ");
		}
	}

}
