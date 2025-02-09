package com.dsa.generic.apple;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/**
 * 76. Minimum Window Substring
 * Given two strings s and t of lengths m and n respectively, return the minimum window
 * substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
 * The testcases will be generated such that the answer is unique.
 * Example 1:
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * Example 2:
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 * Example 3:
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 */

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println("Minimum window of substring : " + minWindow("abbbbbcdd", "abcdd"));
    }

    public static String minWindow(String s, String t) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        int minWindowLength = Integer.MAX_VALUE;
        String minString = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {
                int start = i;
                int end = j;
                if (minWindowLength > (end - start)) {
                    Map<Character, Integer> tempCharMap = new HashMap<>();
                    for (int k = i; k < j; k++) {
                        tempCharMap.put(s.charAt(k), tempCharMap.getOrDefault(s.charAt(k), 0) + 1);
                    }

                    boolean isSubStringPresent = true;
                    for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
                        if (!(tempCharMap.containsKey(entry.getKey()) && tempCharMap.get(entry.getKey()) >= entry.getValue())) {
                            isSubStringPresent = false;
                            break;
                        }
                    }

                    if (isSubStringPresent && minWindowLength > (end - start)) {
                        minWindowLength = end - start;
                        minString = s.substring(start, end);
                    }
                }
            }
        }
        return minString;
    }
}
