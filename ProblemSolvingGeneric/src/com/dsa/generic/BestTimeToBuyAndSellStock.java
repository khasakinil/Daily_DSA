package com.dsa.generic;

/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * e.g Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class BestTimeToBuyAndSellStock {
	public static void main(String args[]) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = getMaxProfit(prices);
		System.out.println("maxProfit  : " + maxProfit);
	}

	private static int getMaxProfit(int[] prices) {
		if (prices.length == 1) {
			return 0;
		}
		
		int maxProfit = 0;
		
		for(int i=0; i<prices.length; i++) {
			for(int j = i+1; j<prices.length; j++) {
				if(prices[j] - prices[i]>maxProfit) {
					maxProfit = prices[j] - prices[i];
				}
			}
		}

//		int buyVal = Integer.MAX_VALUE;
//		int sellVal = Integer.MIN_VALUE;
//		int start = 0, end = prices.length - 1;
//
//		while (start <= end) {
//			if (prices[start] < buyVal) {
//				buyVal = prices[start];
//			}
//			if (prices[end] > sellVal) {
//				sellVal = prices[end];
//			}
//			start++;
//			end--;
//		}
//		return sellVal - buyVal < 0 ? 0 : sellVal - buyVal;
		return maxProfit;
	}
}
