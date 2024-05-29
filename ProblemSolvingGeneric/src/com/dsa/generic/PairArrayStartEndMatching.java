package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;

/*
 * Given pairs like [(5,1)(4,5)(9,4)(11,9)(9,4)]
 * Return [(11,9)(9,4)(4,5)(5,1)] - The start point has to be same as the end point of the previous.
 * Need to return exception in case of empty or duplicate inputs.
 */
public class PairArrayStartEndMatching {
	public static void main(String args[]) {
		Map<Integer, Integer> pairMap = new HashMap<>();
		pairMap.put(5, 1);
		pairMap.put(4, 5);
		pairMap.put(9, 4);
		pairMap.put(11, 9);
		pairMap.put(9, 4);

		getPairArrayStartEndMatching(pairMap);
	}

	private static void getPairArrayStartEndMatching(Map<Integer, Integer> pairMap) {
		int startVal = 0;
		Map<Integer, Integer> dupMap = new HashMap<>();
		for (Map.Entry entry : pairMap.entrySet()) {
			dupMap.put((Integer) entry.getKey(), dupMap.getOrDefault(entry.getKey(), 0) + 1);
			dupMap.put((Integer) entry.getValue(), dupMap.getOrDefault(entry.getValue(), 0) + 1);
		}

		for (Map.Entry<Integer, Integer> map : dupMap.entrySet()) {
			if (map.getValue() == 1 && pairMap.get(map.getKey()) != null) {
				startVal = map.getKey();
			}
		}

		while (startVal != 0) {
			if (pairMap.get(startVal) != null) {
				System.out.println(startVal + "," + pairMap.get(startVal));
			}
			try {
				startVal = pairMap.get(startVal);
			} catch (Exception e) {
				startVal = 0;
			}
		}
	}
}
