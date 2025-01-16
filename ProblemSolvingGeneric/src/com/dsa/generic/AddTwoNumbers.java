package com.dsa.generic;

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
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = 0;
        long num2 = 0;
        long currentDecimal = 1;
        while (l1 != null) {
            if (num1 == 0) {
                num1 = l1.val;
            } else {
                currentDecimal = currentDecimal*10;
                num1 = l1.val*currentDecimal + num1;
            }
            l1 = l1.next;
        }

        currentDecimal = 1;
        System.out.println(num1);

        while (l2 != null) {
            if (num2 == 0) {
                num2 = l2.val;
            } else {
                currentDecimal = currentDecimal*10;
                num2 = l2.val*currentDecimal + num2;
            }
            l2 = l2.next;
        }

        long addingTwoNum = num1 + num2;

        ListNode result = new ListNode();
        ListNode temp = result;
        long current = 0;
        while(addingTwoNum > 0){
            current = addingTwoNum%10;
            temp.val = (int)current;
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
