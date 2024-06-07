package com.dsa.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Given an array of strings words and an integer k, return the k most frequent strings.
 * Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
 * 
 * Example 1:
 * Input: words = ["i","love","leetcode","i","love","coding"], k = 2
 * Output: ["i","love"]
 * Explanation: "i" and "love" are the two most frequent words.
 * Note that "i" comes before "love" due to a lower alphabetical order.
 * 
 * Example 2:
 * Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
 * Output: ["the","is","sunny","day"]
 * Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 */
public class TopKFrequentWords {

	public static void main(String[] args) {
		String[] words = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
		int k = 4;
		List<String> frequentWords = getTopKFrequentWords(words, k);
		System.out.println("frequentWords : " + frequentWords);
	}

	private static List<String> getTopKFrequentWords(String[] words, int k) {
		List<String> frequentWords = new ArrayList<>();
		Map<String, Integer> wordCountMap = new TreeMap();
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			wordCountMap.put(words[i], wordCountMap.getOrDefault(words[i], 0) + 1);
		}

		List<Map.Entry<String, Integer>> mapList = new LinkedList<Map.Entry<String, Integer>>(wordCountMap.entrySet());
		Collections.sort(mapList, (i1, i2) -> i1.getValue() > i2.getValue() ? -1 : 1);

		for (Map.Entry<String, Integer> map : mapList) {
			frequentWords.add(map.getKey());
			count++;
			if (count >= k) {
				break;
			}
		}
		return frequentWords;
	}
}
