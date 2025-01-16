package com.dsa.generic;

/**
 * Given an integer n, return the largest palindromic integer that can be represented as the product of two n-digits integers. Since the answer can be very large, return it modulo 1337.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: 987
 * Explanation: 99 x 91 = 9009, 9009 % 1337 = 987
 * Example 2:
 * <p>
 * Input: n = 1
 * Output: 9
 */

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int largestPalindromeProduct = getLargestPalindromeProduct(2);
        System.out.println("LargestPalindromeProduct for 2 : " + largestPalindromeProduct);
    }

    public static int getLargestPalindromeProduct(int n) {
        if (n == 1) {
            return 9;
        }

        final int mod = 1337;

        // The largest possible n-digit number
        final int maxNum = (int) Math.pow(10, n) - 1;

        // The smllest possible n-digit number
        final int minNum = (int) Math.pow(10, n - 1) - 1;

        // Looping from the largest n-digit number down to the smallest n-digit number
        for (int i = maxNum; i > minNum; --i) {

            //constructing the palindromic value
            final long candidate = getPalindromeCandidate(i);

            // Trying to find if the constructed palindrome has factors with n digits
            for (long j = maxNum; j * j >= candidate; --j) {

                // If the possiblePalindrome is divisible by potentialFactor
                if (candidate % j == 0) {
                    return (int) (candidate % mod);
                }
            }
        }
        return 0;
    }

    private static long getPalindromeCandidate(int i) {
        final String reveresed = new StringBuilder().append(i).reverse().toString();
        return Long.parseLong(i + reveresed);
    }
}
