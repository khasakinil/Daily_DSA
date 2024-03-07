package com.dsa.ps.linkedList;

public class ReverseSingleLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void printLinkedList(Node head) {
		if (head != null) {
			System.out.println();
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		} else {
			System.out.println("Linked List does not exists");
		}
	}

	public static void main(String args[]) {
		ReverseSingleLinkedList rsll = new ReverseSingleLinkedList();
		head = new Node(31);
		head.next = new Node(32);
		head.next.next = new Node(33);
		head.next.next.next = new Node(34);
		head.next.next.next.next = new Node(35);
		head.next.next.next.next.next = new Node(36);
		head.next.next.next.next.next.next = new Node(37);
		head.next.next.next.next.next.next.next = new Node(38);
		head.next.next.next.next.next.next.next.next = new Node(39);
		rsll.printLinkedList(head);

		head = reverseSingleLinkedList(head);
		rsll.printLinkedList(head);
	}

	private static Node reverseSingleLinkedList(Node head) {
		if (head != null) {
			Node nextNode = null;
			Node currentNode = head;
			Node prevNode = null;
			while (currentNode != null) {
				nextNode = currentNode.next;
				currentNode.next = prevNode;
				prevNode = currentNode;
				currentNode = nextNode;
			}
			return prevNode;
		} else {
			System.out.println("Linked List does not exists.");
		}

		return null;
	}
}
