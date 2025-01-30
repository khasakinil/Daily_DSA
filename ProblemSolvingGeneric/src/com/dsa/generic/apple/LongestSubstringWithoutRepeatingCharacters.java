package com.dsa.generic.apple;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("LengthOfLongestSubstring : " + lengthOfLongestSubstring(" "));
    }

    public static int lengthOfLongestSubstring(String s) {
        //check base condition if length is zero and then return
        if (s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        Map<Character, Integer> uniqueCharMap = new HashMap<>();
        int currentPosition = 0;

        while (currentPosition < s.length()) {
            // if uniqueCharMap contains Key as character at current position
            // update maxLength till currentPostion, update the currentPosition with first occurence of character position in uniqucharmap
            // clear uniqueCharMap
            // else update uniqueCharMap with currentCharacter and its position

            if (uniqueCharMap.containsKey(s.charAt(currentPosition))) {
                maxLength = Math.max(maxLength, uniqueCharMap.size());
                currentPosition = uniqueCharMap.get(s.charAt(currentPosition)) + 1;
                uniqueCharMap.clear();
            } else {
                uniqueCharMap.put(s.charAt(currentPosition), currentPosition);
                currentPosition++;
            }
        }
        return maxLength > uniqueCharMap.size() ? maxLength : uniqueCharMap.size();
    }
}
