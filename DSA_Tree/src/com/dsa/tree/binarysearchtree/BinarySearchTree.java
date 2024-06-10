package com.dsa.tree.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	private BinaryNode root;

	public BinarySearchTree() {
		root = null;
	}

	public void insertInBinarySearchTree(int nodeValue) {
		root = insertInBinarySearchTree(root, nodeValue);
	}

	private BinaryNode insertInBinarySearchTree(BinaryNode root, int nodeValue) {
		if (root == null) {
			BinaryNode node = new BinaryNode();
			node.setValue(nodeValue);
			root = node;
		} else if (nodeValue <= root.getValue()) {
			root.setLeft(insertInBinarySearchTree(root.getLeft(), nodeValue));
		} else {
			root.setRight(insertInBinarySearchTree(root.getRight(), nodeValue));
		}
		return root;
	}

	public void leverOrderTraversal() {
		levelOrderTraversal(root);
	}

	private void levelOrderTraversal(BinaryNode root) {
		if (root == null) {
			System.out.println("\nTree does not exists");
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
		preOrderTraversal(root);

	}

	private void preOrderTraversal(BinaryNode root) {
		if (root == null) {
			return;
		} else {
			System.out.print(root.getValue() + " ");
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(BinaryNode root) {
		if (root == null) {
			return;
		} else {
			inOrderTraversal(root.getLeft());
			System.out.print(root.getValue() + " ");
			inOrderTraversal(root.getRight());
		}
	}

	public void postOrderTraversal() {
		postOrderTraversal(root);
	}

	private void postOrderTraversal(BinaryNode root) {
		if (root == null) {
			return;
		} else {
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.print(root.getValue() + " ");
		}
	}

	public void printTreeGraphically() {
		if (root == null) {
			System.out.println("Tree does not exists");
		}
		
		
	}

}
