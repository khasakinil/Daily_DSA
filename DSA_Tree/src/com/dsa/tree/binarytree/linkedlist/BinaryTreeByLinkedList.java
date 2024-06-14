package com.dsa.tree.binarytree.linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
			System.out.println("\nBinary does not exists");
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
			System.out.println("\nBinary does not exists");
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
			System.out.println("\nBinary does not exists");
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
			System.out.println("\nBinary does not exists");
			return;
		}

		postOrderTraversal(root.getLeft());
		postOrderTraversal(root.getRight());
		System.out.print(root.getValue() + " ");
	}

	public void searchNodeInBinaryTree(int nodeValue) {
		if (root == null) {
			System.out.println("\nBinary does not exists");
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

	public void deleteNodeFromBinaryTree(int nodeValue) {
		if (root == null) {
			System.out.println("\nBinary does not exists");
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			if (currentNode.getValue() == nodeValue) {
				currentNode.setValue(getDeepestNode().getValue());
				deleteDeepestNode();
				return;
			} else {
				if (currentNode.getLeft() != null) {
					queue.add(currentNode.getLeft());
				}
				if (currentNode.getRight() != null) {
					queue.add(currentNode.getRight());
				}
			}
		}
	}

	private void deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		BinaryNode prevNode = null, currentNode = null;
		while (!queue.isEmpty()) {
			prevNode = currentNode;
			currentNode = queue.remove();
			if (currentNode.getLeft() == null) {
				prevNode.setRight(null);
				return;
			}
			if (currentNode.getRight() == null) {
				currentNode.setLeft(null);
				return;
			}
			queue.add(currentNode.getLeft());
			queue.add(currentNode.getRight());
		}

	}

	private BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode currentNode = null;
		while (!queue.isEmpty()) {
			currentNode = queue.remove();
			if (currentNode.getLeft() != null) {
				queue.add(currentNode.getLeft());
			}
			if (currentNode.getRight() != null) {
				queue.add(currentNode.getRight());
			}
		}
		return currentNode;
	}

	public void deleteBinaryTree() {
		root = null;
	}

	public void InOrderTraversalWithouRecursion() {
		System.out.println("\nIn Order Traversal Without Recursion-");
		InOrderTraversalWithouRecursion(root);
	}

	private void InOrderTraversalWithouRecursion(BinaryNode root) {
		if (root == null) {
			return;
		}
		Stack<BinaryNode> stack = new Stack<>();
		BinaryNode current = root;

		while (current != null || stack.size() > 0) {
			while (current != null) {
				stack.push(current);
				current = current.getLeft();
			}

			current = stack.pop();
			System.out.print(current.getValue() + " ");
			current = current.getRight();
		}
	}
}
