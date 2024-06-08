package com.dsa.tree.binarytree.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {
	private BinaryNode root;

	public BinaryTreeByLinkedList() {
		root = null;
	}

	public void insertNodeInBinaryTree(int nodeValue) {
		BinaryNode node = new BinaryNode();
		node.setValue(nodeValue);

		if (root == null) {
			root = node;
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(node);
				break;
			} else if (currentNode.getRight() == null) {
				currentNode.setRight(node);
				break;
			} else {
				queue.add(currentNode.getLeft());
				queue.add(currentNode.getRight());
			}
		}
	}

	public void levelOrderTraversal() {
		System.out.println("\nLevel Order Traversal-");
		levelOrderTraversal(root);
	}

	private void levelOrderTraversal(BinaryNode root) {
		if (root == null) {
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			System.out.print(currentNode.getValue() + " ");
			if (currentNode.getLeft() != null) {
				queue.add(currentNode.getLeft());
			}
			if (currentNode.getRight() != null) {
				queue.add(currentNode.getRight());
			}
		}
	}

	public void preOrderTraversal() {
		System.out.println("\nPre Order Traversal-");
		preOrderTraversal(root);
	}

	private void preOrderTraversal(BinaryNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.getValue() + " ");
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());
	}

	public void InOrderTraversal() {
		System.out.println("\nIn Order Traversal-");
		inOrderTraversal(root);
	}

	private void inOrderTraversal(BinaryNode root) {
		if (root == null) {
			return;
		}

		inOrderTraversal(root.getLeft());
		System.out.print(root.getValue() + " ");
		inOrderTraversal(root.getRight());
	}

	public void postOrderTraversal() {
		System.out.println("\nPost Order Traversal-");
		postOrderTraversal(root);
	}

	private void postOrderTraversal(BinaryNode root) {
		if (root == null) {
			return;
		}

		postOrderTraversal(root.getLeft());
		postOrderTraversal(root.getRight());
		System.out.print(root.getValue() + " ");
	}

	public void searchNodeInBinaryTree(int nodeValue) {
		if (root == null) {
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			if (currentNode.getValue() == nodeValue) {
				System.out.println("\nNode with value : " + nodeValue + " found in Binary Tree");
				return;
			}
			if (currentNode.getLeft() != null) {
				queue.add(currentNode.getLeft());
			}
			if (currentNode.getRight() != null) {
				queue.add(currentNode.getRight());
			}
		}
		System.out.println("\nNode with value : " + nodeValue + " not found in Binary Tree");
	}
}
