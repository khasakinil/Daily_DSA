package com.dsa.generic;

/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * e.g Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * 
 * Problem Solving approach-
 * 
 * 1. initialize the maxSellStock
 * 2. update maxSellStock from right to left
 * 3. Also in the each iteration check and update:
 * 		
 * 		if (maxProfit < maxSellStock[i] - prices[i]) {
 * 			maxProfit = maxSellStock[i] - prices[i];
 * 		}
 * 
 * 4. return maxProfit
 * 5. Time Complexity : O(n), Space Complexity : O(n) 
 * 
 */
public class BestTimeToBuyAndSellStock1 {
	public static void main(String args[]) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = getMaxProfit(prices);
		System.out.println("maxProfit  : " + maxProfit);
	}

	private static int getMaxProfit(int[] prices) {
		if (prices.length == 1) {
			return 0;
		}

		int[] maxSellStock = new int[prices.length];

		int maxProfit = 0, maxSellStockFromRight = 0;
		for (int i = prices.length - 1; i >= 0; i--) {
			if (maxSellStockFromRight < prices[i]) {
				maxSellStockFromRight = prices[i];
			}

			maxSellStock[i] = maxSellStockFromRight;
			if (maxProfit < maxSellStock[i] - prices[i]) {
				maxProfit = maxSellStock[i] - prices[i];
			}
		}
		return maxProfit;
	}
}
