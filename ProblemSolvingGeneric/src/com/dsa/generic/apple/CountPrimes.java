package com.dsa.generic.apple;

/**
 * 204. Count Primes
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 * Example 1:
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * Example 2:
 * Input: n = 0
 * Output: 0
 * Example 3:
 * Input: n = 1
 * Output: 0
 */

public class CountPrimes {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Total prime number till " + n + " : " + countPrimes(n));
    }

    public static int countPrimes(int n) {

        int countPrimes = 0;
        for(int i=2; i<n; i++){
            boolean status = true;
            int j =i, start = 2;
            while(start<j){
                if(j%start==0){
                    status = false;
                    break;
                }
                start++;
            }
            if(status){
                countPrimes++;
            }
        }
        return countPrimes;
    }
}
