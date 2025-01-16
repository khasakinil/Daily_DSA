package com.dsa.generic;

import java.math.BigInteger;
import java.util.Stack;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
public class AddTwoNumbers {
    public static void main(String args[]) {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(6);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);

        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1Str = "";
        String num2Str = "";
        while (l1 != null) {
            num1Str = l1.val + num1Str;
            l1 = l1.next;
        }

        while (l2 != null) {
            num2Str = l2.val + num2Str;
            l2 = l2.next;
        }

        long addingTwoNum = Long.parseLong(num1Str) + Long.parseLong(num2Str);

        ListNode result = new ListNode();
        ListNode temp = result;
        while(addingTwoNum > 0){
            temp.val = (int)(addingTwoNum%10);
            addingTwoNum = addingTwoNum/10;
            if(addingTwoNum>0){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }

        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
