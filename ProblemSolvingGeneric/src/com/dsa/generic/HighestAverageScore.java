package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Given a 2-D String array of student-marks find the student with the highest average and output his average score. 
 * If the average is in decimals, floor it down to the nearest integer.
 * Example 1:
 * Input:  [{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}]
 * Output: 99
 * Explanation: Since Jessica's average is greater than Bob's, Mike's and Jason's average.
 */
public class HighestAverageScore {

	public static void main(String[] args) {
		String[][] scores = { { "Bob", "87" }, { "Mike", "35" }, { "Bob", "52" }, { "Jason", "35" }, { "Mike", "55" },
				{ "Jessica", "99" } };
		int highestScore = getHighestAverageScore(scores);
		System.out.println("highestScore : " + highestScore);
	}

	private static int getHighestAverageScore(String[][] scores) {
		Map<String, Integer> totalSubjectMap = new HashMap<>();
		Map<String, Integer> totalMarksMap = new HashMap<>();

		int totalAverageMarks = 0;

		for (int i = 0; i < scores.length; i++) {
			totalSubjectMap.put(scores[i][0], totalSubjectMap.getOrDefault(scores[i][0], 0) + 1);
			totalMarksMap.put(scores[i][0],
					totalSubjectMap.getOrDefault(scores[i][0], 0) + (Integer.parseInt(scores[i][1])));
		}

		for (Entry<String, Integer> map : totalSubjectMap.entrySet()) {
			if (totalMarksMap.get(map.getKey()) / map.getValue() > totalAverageMarks) {
				totalAverageMarks = totalMarksMap.get(map.getKey()) / map.getValue();
			}
		}
		return totalAverageMarks;
	}

}
