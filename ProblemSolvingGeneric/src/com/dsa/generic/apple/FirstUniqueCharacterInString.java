package com.dsa.generic.apple;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * 387. First Unique Character in a String
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * Explanation:
 * The character 'l' at index 0 is the first character that does not occur at any other index.
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */

public class FirstUniqueCharacterInString {
    public static void main(String[] args){
        String str = "lleetcode";
        System.out.println("First unique character location in String " + str + " : " + firstUniqChar(str));
    }

    public static int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> charIndexMap = new LinkedHashMap<>();
        Set<Character> charIndexDupSet = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            if(charIndexMap.containsKey(s.charAt(i))){
                charIndexDupSet.add(s.charAt(i));
            }
            charIndexMap.put(s.charAt(i), i);
        }

        for(Map.Entry<Character, Integer> entry : charIndexMap.entrySet()){
           if(!charIndexDupSet.contains(entry.getKey())){
               return (int)entry.getValue();
           }
        }

        return -1;
    }
}
