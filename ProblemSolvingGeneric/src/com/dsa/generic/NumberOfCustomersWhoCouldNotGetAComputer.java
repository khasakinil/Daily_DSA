package com.dsa.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Function to find Number of customers who could not get a computer
 * A customer will be serviced if there is an unoccupied computer. 
 * No letter will occur more than two times. 
 * Customers who leave without using a computer always depart before customers who are currently using the computers.
 */

public class NumberOfCustomersWhoCouldNotGetAComputer {
	public static void main(String args[]) {
		System.out.println("Customers : " + "ABBAJJKZKZ," + " Number of customers who could not get the computer: "
				+ getCustomersWhoCouldNotGetAComputer("ABBAJJKZKZ", 2));
		System.out.println("Customers : " + "GACCBDDBAGEE," + " Number of customers who could not get the computer: "
				+ getCustomersWhoCouldNotGetAComputer("GACCBDDBAGEE", 3));

		System.out.println("Customers : " + "GACCBGDDBAEE," + " Number of customers who could not get the computer: "
				+ getCustomersWhoCouldNotGetAComputer("GACCBGDDBAEE", 3));

		System.out.println("Customers : " + "ABCBCA," + " Number of customers who could not get the computer: "
				+ getCustomersWhoCouldNotGetAComputer("ABCBCA", 1));

		System.out.println("Customers : " + "ABCBCADEED," + " Number of customers who could not get the computer: "
				+ getCustomersWhoCouldNotGetAComputer("ABCBCADEED", 1));
	}

	private static int getCustomersWhoCouldNotGetAComputer(String customers, int availableComputers) {
		Set<Character> custSet = new HashSet<>();
		List<Character> custList = new ArrayList<>();
		for (int i = 0; i < customers.length(); i++) {
			if (custList.size() > 0 && custList.contains(customers.charAt(i))) {
				custList.remove(custList.indexOf(customers.charAt(i)));
			} else if (custList.size() < availableComputers) {
				custList.add(customers.charAt(i));
			} else {
				custSet.add(customers.charAt(i));
			}
		}
		return custSet.size();
	}
}
