package com.dsa.generic.apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * Given an array of strings words and an integer k, return the k most frequent
 * strings. Return the answer sorted by the frequency from highest to lowest.
 * Sort the words with the same frequency by their lexicographical order.
 * Example 1: Input: words = ["i","love","leetcode","i","love","coding"], k = 2
 * Output: ["i","love"] Explanation: "i" and "love" are the two most frequent
 * words. Note that "i" comes before "love" due to a lower alphabetical order.
 * Example 2: Input: words =
 * ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4 Output:
 * ["the","is","sunny","day"] Explanation: "the", "is", "sunny" and "day" are
 * the four most frequent words, with the number of occurrence being 4, 3, 2 and
 * 1 respectively.
 */

public class TopKFrequentWords {
	public static void main(String args[]) {
		String[] words = { "rmrypv", "zgsedk", "jlmetsplg", "wnfbo", "hnnftqf", "bxlr", "sviavwoxss", "jdbgvc",
				"zddeno", "rxgw", "hnnftqf", "hdmvplne", "rlmdt", "jlmetsplg", "ous", "rmrypv", "fwxulnpit", "dmhuq",
				"rxgw", "ledleb", "bxlr", "indbvb", "ckqqibnx", "cub", "ijww", "ehd", "hfhlfqzkcn", "sviavwoxss",
				"rxgw", "bxjxpfp", "mgqj", "oic", "ptk", "fwxulnpit", "ijww", "sviavwoxss", "bgfvfa", "zfkgsudxq",
				"alkq", "dmhuq", "zddeno", "rxgw", "zgsedk", "amarxpg", "bgfvfa", "wnfbo", "sviavwoxss", "sviavwoxss",
				"alkq", "nmclxk", "zgsedk", "bwowfvira", "ous", "bxlr", "zddeno", "rxgw", "ous", "wnfbo", "rmrypv",
				"sviavwoxss", "ehd", "zgsedk", "jlmetsplg", "abxvhyehv", "ledleb", "wnfbo", "bgfvfa", "bwowfvira",
				"amarxpg", "wnfbo", "bwowfvira", "dmhuq", "ouy", "bxlr", "rxgw", "oic", "hnnftqf", "ledleb", "rlmdt",
				"oldainprua", "ous", "ckqqibnx", "dmhuq", "hnnftqf", "oic", "jlmetsplg", "ppn", "amarxpg", "jlgfgwb",
				"bxlr", "bwowfvira", "hdmvplne", "oic", "ledleb", "bwowfvira", "oic", "ptk", "dmhuq", "abxvhyehv",
				"ckqqibnx", "indbvb", "ypzfk", "rmrypv", "bxjxpfp", "amarxpg", "dmhuq", "sviavwoxss", "bwowfvira",
				"zfkgsudxq", "wnfbo", "rxgw", "jxkvrmajri", "cub", "abxvhyehv", "bwowfvira", "indbvb", "ehd",
				"ckqqibnx", "oic", "ptk", "hnnftqf", "ouy", "oic", "zgsedk", "abxvhyehv", "ypzfk", "ptk", "sviavwoxss",
				"rmrypv", "oic", "ous", "abxvhyehv", "hnnftqf", "hfhlfqzkcn", "ledleb", "cub", "ppn", "zddeno",
				"indbvb", "oic", "jlmetsplg", "ouy", "bwowfvira", "bklij", "gucayxp", "zfkgsudxq", "hfhlfqzkcn",
				"zddeno", "ledleb", "zfkgsudxq", "hnnftqf", "bgfvfa", "jlmetsplg", "indbvb", "ehd", "wnfbo", "hnnftqf",
				"rlmdt", "bxlr", "indbvb", "jdbgvc", "jlmetsplg", "cub", "jlgfgwb", "ypzfk", "indbvb", "dmhuq",
				"jlmetsplg", "zgsedk", "rmrypv", "cub", "rxgw", "ledleb", "rxgw", "sviavwoxss", "ckqqibnx", "hdmvplne",
				"dmhuq", "wnfbo", "jlmetsplg", "bxlr", "zfkgsudxq", "bxjxpfp", "ledleb", "indbvb", "ckqqibnx", "ous",
				"ckqqibnx", "cub", "ous", "abxvhyehv", "bxlr", "hfhlfqzkcn", "hfhlfqzkcn", "oic", "ten", "amarxpg",
				"indbvb", "cub", "alkq", "alkq", "sviavwoxss", "indbvb", "bwowfvira", "ledleb" };
		System.out.println("Top K Frequent Words : " + topKFrequent(words, 41));
	}

	public static List<String> topKFrequent(String[] words, int k) {
//		List<String> frequentWords = new ArrayList<>();
//		Map<String, Integer> wordCountMap = new TreeMap();
//		int count = 0;
//
//		for (int i = 0; i < words.length; i++) {
//			wordCountMap.put(words[i], wordCountMap.getOrDefault(words[i], 0) + 1);
//		}
//
//		List<Map.Entry<String, Integer>> mapList = new LinkedList<Map.Entry<String, Integer>>(wordCountMap.entrySet());
//		Collections.sort(mapList,
//				(i1, i2) -> (i1.getValue() == i2.getValue() ? 1 : i1.getValue() > i2.getValue() ? -1 : 1));
//
//		for (Map.Entry<String, Integer> map : mapList) {
//			frequentWords.add(map.getKey());
//			count++;
//			if (count >= k) {
//				break;
//			}
//		}
//
//		return frequentWords;
		
		Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>((word1, word2) -> {
            int frequencyDifference = wordCount.get(word1) - wordCount.get(word2);
            if (frequencyDifference == 0) {
                return word2.compareTo(word1);
            }
            return frequencyDifference;
        });

        for (String word : wordCount.keySet()) {
            heap.offer(word);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        LinkedList<String> topKWords = new LinkedList<>();
        while (!heap.isEmpty()) {
            topKWords.addFirst(heap.poll());
        }

        return topKWords;
	}
}
