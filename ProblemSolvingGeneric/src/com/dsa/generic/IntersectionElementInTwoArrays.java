package com.dsa.generic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * find the intersection elements in two arrays. Example:
 * Input: arr1: [1,1,2,2,2] arr2: [1,1,1,2,2,3,4,5]
 * Output: [1,1,2,2];
 */
public class IntersectionElementInTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 2, 2 }, arr2 = { 1, 1, 1, 2, 2, 3, 4, 5 };
		List<Integer> intersetionElements = getIntersectionElementInTwoArrays(arr1, arr2);
		System.out.println("intersetionElements : " + intersetionElements);
	}

	private static List<Integer> getIntersectionElementInTwoArrays(int[] arr1, int[] arr2) {
		
		List<Integer> intersectionElements = new ArrayList<>();
		Map<Integer, Integer> arrMap1 = new LinkedHashMap<Integer, Integer>();
		Map<Integer, Integer> arrMap2 = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < arr1.length; i++) {
			arrMap1.put(arr1[i], arrMap1.getOrDefault(arr1[i], 0) + 1);
		}

		for (int i = 0; i < arr2.length; i++) {
			arrMap2.put(arr2[i], arrMap2.getOrDefault(arr2[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> map : arrMap1.entrySet()) {
			if (arrMap2.get(map.getKey()) != null) {
				int min = Math.min(map.getValue(), arrMap2.get(map.getKey()));
				for (int i = 0; i < min; i++) {
					intersectionElements.add(map.getKey());
				}
			}
		}
		return intersectionElements;
	}

}
