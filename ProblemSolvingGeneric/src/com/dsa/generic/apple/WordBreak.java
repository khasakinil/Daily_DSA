package com.dsa.generic.apple;

import java.util.Arrays;
import java.util.List;

/**
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 * Example 1:
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * Example 2:
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 * Note that you are allowed to reuse a dictionary word.
 * Example 3:
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: false
 */

public class WordBreak {
    public static void main(String[] args) {
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
        wordBreak(s, wordDict);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        for (String word : wordDict) {
            while (s.contains(word)) {
                s = s.substring(0, s.indexOf(word)) + s.substring(s.indexOf(word) + word.length());
            }
        }
        System.out.println("WordBreak : " + s);
        return s.length() == 0;
    }
}
