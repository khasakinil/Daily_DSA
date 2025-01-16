package com.dsa.generic;

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
public class AddTwoNumbers1 {
    public static void main(String args[]) {
        ListNode1 l1 = new ListNode1(0);
        l1.next = new ListNode1(8);
        l1.next.next = new ListNode1(6);

        ListNode1 l2 = new ListNode1(1);
        l2.next = new ListNode1(9);

        ListNode1 addition = addTwoNumbers(l1, l2);

        printNodeValues(addition);
    }

    private static void printNodeValues(ListNode1 node) {
        System.out.println();
        while(node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    private static ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        ListNode1 result = new ListNode1();
        ListNode1 temp = result;
        int sum = 0;
        int carry = 0;

        //iterate while end of each node list
        while (l1 != null || l2 != null) {
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;

            //set temp value to the sum
            temp.val = sum >= 10 ? sum%10 : sum;

            //take reminder to add it to the next sum
            carry = sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            if (l1 != null || l2 != null) {
                temp.next = new ListNode1();
                temp = temp.next;
            }
        }

        //if carry exists add it to the end of the list
        if(carry !=0){
            temp.next = new ListNode1(carry);
        }

        // return result which already having the reference to the temp
        return result;
    }
}

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}
