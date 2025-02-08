package com.dsa.generic.apple;

/**
 * 233. Number of Digit One
 * Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
 * Example 1:
 * Input: n = 13
 * Output: 6
 * Example 2:
 * Input: n = 0
 * Output: 0
 */

public class NumberOfDigitOne {
    public static void main(String[] args) {
        System.out.println("Number of digit one in " + 824883294 + " : " + countDigitOne(824883294));
    }

    public static int countDigitOne(int n) {
        if (n < 0) {
            return 0;
        }

        int q = n, x = 1, digitOneCount = 0;

        do {
            int digit = q % 10;
            q /= 10;
            digitOneCount += q * x;
            if (digit == 1) {
                digitOneCount += n % x + 1;
            }
            if (digit > 1) {
                digitOneCount += x;
            }
            x *= 10;
        } while (q > 0);
        return digitOneCount;

/*
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == 1) {
                    digitOneCount++;
                }
                num = num / 10;
            }
        }
        return digitOneCount;
 */

    }
}
