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
		if (head == null) {
			head = node;
		} else {
			head.prev = node;
			node.next = head;
			head = node;
		}
		return head;
	}

	public void printDoublyLinkedList(Node head) {
		if (head == null) {
			System.out.println("Linked List does not exists");
		} else {
			System.out.println();
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}

	public static void main(String args[]) {

		ReverseDoublyLinkedList rdll = new ReverseDoublyLinkedList();
		head = new Node(21);
		head = rdll.insertInDoublyLinkedList(22);
		head = rdll.insertInDoublyLinkedList(23);
		head = rdll.insertInDoublyLinkedList(24);
		head = rdll.insertInDoublyLinkedList(25);
		head = rdll.insertInDoublyLinkedList(26);
		head = rdll.insertInDoublyLinkedList(27);
		head = rdll.insertInDoublyLinkedList(28);
		head = rdll.insertInDoublyLinkedList(29);
		rdll.printDoublyLinkedList(head);

		head = rdll.reverseDoublyLinkedList(head);
		rdll.printDoublyLinkedList(head);
	}

	private Node reverseDoublyLinkedList(Node head) {
		System.out.println();
		if (head != null) {
			Node current = head;
			Node temp = null;
			while(current!= null) {
				temp = current.next;
				current.next = current.prev;
				current.prev = temp;
				current = current.prev;
			}
			return temp;
		} else {
			System.out.println("Linked List does not exists..");
		}
		return null;
	}
}
