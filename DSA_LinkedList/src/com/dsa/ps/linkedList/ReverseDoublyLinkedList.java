package com.dsa.ps.linkedList;

public class ReverseDoublyLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public Node insertInDoublyLinkedList(int data) {
		Node node = new Node(data);
		node.prev = null;
		node.next = head;
		if (head != null) {
			head.prev = node;
		}
		head = node;
		return head;
	}

	public void printDoublyLinkedList(Node head) {
		if (head == null) {
			System.out.println("Linked List does not exists");
		} else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}

	public static void main(String args[]) {
		ReverseDoublyLinkedList rdll = new ReverseDoublyLinkedList();
		head = rdll.insertInDoublyLinkedList(22);
		head = rdll.insertInDoublyLinkedList(23);
		head = rdll.insertInDoublyLinkedList(24);
		head = rdll.insertInDoublyLinkedList(25);
		head = rdll.insertInDoublyLinkedList(26);
		head = rdll.insertInDoublyLinkedList(27);
		head = rdll.insertInDoublyLinkedList(28);
		head = rdll.insertInDoublyLinkedList(29);
		System.out.println("Original Linked List : ");
		rdll.printDoublyLinkedList(head);

		head = rdll.reverseDoublyLinkedList(head);
		System.out.println("\nAfter reversing Linked List : ");
		rdll.printDoublyLinkedList(head);
	}

	private Node reverseDoublyLinkedList(Node head) {
		if (head != null) {
			Node current = head;
			Node temp = null;
			while (current != null) {
				temp = current.prev;
				current.prev = current.next;
				current.next = temp;
				current = current.prev;
			}
			if (temp != null) {
				return temp.prev;
			}
			return head;
		} else {
			System.out.println("Linked List does not exists..");
		}
		return null;
	}
}
