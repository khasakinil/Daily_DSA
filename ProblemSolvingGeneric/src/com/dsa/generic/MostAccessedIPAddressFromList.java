package com.dsa.generic;

import java.util.HashMap;
import java.util.Map;

/*
 *Given a log file, return IP address(es) which accesses the site most often.
 *e.g: "10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 2 213", "10.0.0.2 - log entry 1 11", "10.0.0.2 - log entry 2 213", "10.0.0.2 - log entry 133132"
 *Ans: 10.0.0.1 
 */
public class MostAccessedIPAddressFromList {

	public static void main(String[] args) {
		String[] lines = { "10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20" };
		String mostAccessedIpAddress = getMostAccessedIPAddressFromList(lines);
		System.out.println("mostAccessedIpAddress : " + mostAccessedIpAddress);

	}

	private static String getMostAccessedIPAddressFromList(String[] lines) {
		Map<String, Integer> ipMap = new HashMap<>();
		int mostAccessedIpCount = 0;
		String mostAccessedIp = "";
		for (int i = 0; i < lines.length; i++) {
			String[] strSplit = lines[i].split("\\ ");
			for (int j = 0; j < strSplit.length; j++) {
				if (strSplit[j].contains(".")) {
					ipMap.put(strSplit[j], ipMap.getOrDefault(strSplit[j], 0) + 1);
				}
			}
		}

		for (Map.Entry<String, Integer> map : ipMap.entrySet()) {
			if (map.getValue() > mostAccessedIpCount) {
				mostAccessedIpCount = map.getValue();
				mostAccessedIp = map.getKey();
			}
		}

		return mostAccessedIp;
	}
}
