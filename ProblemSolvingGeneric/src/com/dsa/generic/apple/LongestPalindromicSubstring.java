package com.dsa.generic.apple;

/**
 * 5. Longest Palindromic Substring
 * Given a string s, return the longest
 * palindromic
 * substring
 * in s.
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 */

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "bb";
        //both solutions are accepted on leetcode
        System.out.println("Longest palindromic Substring : " + longestPalindromeSolution1(s));
        System.out.println("Longest palindromic Substring : " + longestPalindromeSolution2(s));
    }

    public static String longestPalindromeSolution1(String s) {
        if (s.length() == 1) {
            return s;
        }

        int max = 0, start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (max < j - i && isPalindrome(s.substring(i, j))) {
                    max = j - i;
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end);
    }

    public static String longestPalindromeSolution2(String s) {
        if (s.length() == 1) {
            return s;
        }
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (longestPalindrome.length() < (j - i)) {
                    if (isPalindrome(s.substring(i, j))) {
                        if (s.substring(i, j).length() > longestPalindrome.length()) {
                            longestPalindrome = s.substring(i, j);
                        }
                    }
                }
            }
        }
        return longestPalindrome;
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
