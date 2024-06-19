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
 * 1. In each iteration check the minBuy so far
 * 	- substract current sell from minBuy and if it is greater than the previous maxProfit and update maxProfit
 * 2. Time Complexity : O(n), Space Complexity : O(1)
 *  
 */
public class BestTimeToBuyAndSellStock2 {
	public static void main(String args[]) {
		int[] prices = { 7, 1, 5, 3, 6, 14 };
		int maxProfit = getMaxProfit(prices);
		System.out.println("maxProfit  : " + maxProfit);
	}

	private static int getMaxProfit(int[] prices) {
		if (prices.length == 1) {
			return 0;
		}

		int minBuy = Integer.MAX_VALUE, maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minBuy) {
				minBuy = prices[i];
			}
			if (prices[i] - minBuy > maxProfit) {
				maxProfit = prices[i] - minBuy;
			}
		}
		return maxProfit;
	}
}
