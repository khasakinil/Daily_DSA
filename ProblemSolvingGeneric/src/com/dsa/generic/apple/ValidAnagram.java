package com.dsa.generic.apple;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 242. Valid Anagram
 * Given two strings s and t, return true if t is an
 * anagram
 * of s, and false otherwise.
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println("isAnagram : " + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> str1CharCount = new HashMap<>();
        HashMap<Character, Integer> str2CharCount = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            str1CharCount.put(s.charAt(i), str1CharCount.getOrDefault(s.charAt(i), 0) + 1);
        }


        for (int i = 0; i < t.length(); i++) {
            str2CharCount.put(t.charAt(i), str2CharCount.getOrDefault(t.charAt(i), 0) + 1);
        }

        if (str1CharCount.size() != str2CharCount.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : str1CharCount.entrySet()) {
            if (!Objects.equals(str2CharCount.get(entry.getKey()), entry.getValue())) {
                return false;
            }
        }

        return true;
    }
}
