package com.dsa.generic.apple;

/**
 * 121. Best Time to Buy and Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. 
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 
 * Example 1: Input: prices = [7,1,5,3,6,4]
 * Output: 5 
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price =6), profit = 6-1 = 5. 
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell. 
 * Example 2: Input: prices = [7,6,4,3,1] 
 * Output: 0 
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class BestTimeToBuyAndSellStock {
	public static void main(String args[]) {
		int[] prices = { 7,6,4,3,1 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int[] minFromLeft = new int[prices.length];
		int[] maxFromRight = new int[prices.length];

		int min = prices[0];
		int max = prices[prices.length - 1];

		for (int i = 0; i < prices.length; i++) {
			if (min > prices[i]) {
				min = prices[i];
			}
			minFromLeft[i] = min;
		}

		for (int i = prices.length - 1; i >= 0; i--) {
			if (max < prices[i]) {
				max = prices[i];
			}
			maxFromRight[i] = max;
		}

		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (maxProfit < maxFromRight[i] - minFromLeft[i]) {
				maxProfit = maxFromRight[i] - minFromLeft[i];
			}
		}

		return maxProfit;
	}

}
