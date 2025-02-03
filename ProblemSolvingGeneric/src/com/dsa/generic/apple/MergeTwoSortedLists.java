package com.dsa.generic.apple;

/**
 * 21. Merge Two Sorted Lists
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNodeClass list1 = new ListNodeClass(1);
        list1.next = new ListNodeClass(2);
        list1.next.next = new ListNodeClass(4);

        ListNodeClass list2 = new ListNodeClass(1);
        list2.next = new ListNodeClass(3);
        list2.next.next = new ListNodeClass(4);

        ListNodeClass mergedList = mergeTwoLists(list1, list2);
        printList(mergedList);
    }

    private static void printList(ListNodeClass mergedList) {
        ListNodeClass temp = mergedList;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static ListNodeClass mergeTwoLists(ListNodeClass list1, ListNodeClass list2) {

        if (list1 == null && list2 == null) {
            return list1;
        }

        ListNodeClass tempNode = new ListNodeClass();
        ListNodeClass mergedList = tempNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tempNode.val = list1.val;
                list1 = list1.next;
            } else {
                tempNode.val = list2.val;
                list2 = list2.next;
            }
            if (list1 != null || list2 != null) {
                tempNode.next = new ListNodeClass();
                tempNode = tempNode.next;
            }
        }

        while (list1 != null) {
            tempNode.val = list1.val;
            list1 = list1.next;
            if ((list1 != null)) {
                tempNode.next = new ListNodeClass();
                tempNode = tempNode.next;
            }
        }

        while (list2 != null) {
            tempNode.val = list2.val;
            list2 = list2.next;
            if ((list2 != null)) {
                tempNode.next = new ListNodeClass();
                tempNode = tempNode.next;
            }
        }

        return mergedList;
    }
}

class ListNodeClass {
    int val;
    ListNodeClass next;

    public ListNodeClass() {
    }

    ListNodeClass(int val) {
        this.val = val;
    }

    ListNodeClass(int val, ListNodeClass next) {
        this.val = val;
        this.next = next;
    }
}
