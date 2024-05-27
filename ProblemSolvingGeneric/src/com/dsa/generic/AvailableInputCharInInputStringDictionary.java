package com.dsa.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a dictionary of the words(strings) which contains different words & you are given an input string e.g. “abd”. 
 * You need to find the largest word available in the supplied dictionary which can be made using the letters of input string. 
 * The returned word can contain only the same no of occurrences of the letters as given in the input string 
 * i.e. if a letter is given once then in the output it should be existed only once. Examples:
 * 
 * 1, Dictionary {“to”, “banana”, “toe”, “dogs”, “ababcd”, “elephant”} and input string is “eot”. Output should be “toe”
 * 2, Dictionary is same as specified in example a but the input string is “ogtdes” and the output is “dogs” and “toes”

 */
public class AvailableInputCharInInputStringDictionary {

	public static void main(String[] args) {
		String[] array = { "to", "banana", "toe", "dogs", "ababcd", "elephant" };
		String input = "ogtdes";

		List<String> allCharOfInputAvailableInDictionary = getAvailableInputCharInInputStringDictionary(array, input);
		System.out.println("allCharOfInputAvailableInDictionary : " + allCharOfInputAvailableInDictionary);
	}

	static List<String> getAvailableInputCharInInputStringDictionary(String[] array, String input) {
		List<String> result = new ArrayList<>();

		Map<Character, Character> inputCharMap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			inputCharMap.put(input.charAt(i), input.charAt(i));
		}

		boolean isStrAvailable = true;
		for (String str : array) {
			isStrAvailable = true;
			for (int i = 0; i < str.length(); i++) {
				if (inputCharMap.get(str.charAt(i)) == null) {
					isStrAvailable = false;
					break;
				}
			}
			if (isStrAvailable) {
				result.add(str);
			}
		}
		return result;
	}

}
