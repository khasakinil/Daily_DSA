package com.dsa.tree.binarysearchtree;

public class BinarySearchTreeMain {
	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertInBinarySearchTree(100);
		bst.insertInBinarySearchTree(90);
		bst.insertInBinarySearchTree(110);
		bst.insertInBinarySearchTree(80);
		bst.insertInBinarySearchTree(105);
		bst.insertInBinarySearchTree(95);
		bst.insertInBinarySearchTree(115);
		bst.insertInBinarySearchTree(97);
		bst.insertInBinarySearchTree(120);
		bst.insertInBinarySearchTree(113);

		System.out.println("\n\nLevel Order Traversal");
		bst.leverOrderTraversal();

		System.out.println("\n\nPre Order Traversal");
		bst.preOrderTraversal();

		System.out.println("\n\nIn Order Traversal");
		bst.inOrderTraversal();

		System.out.println("\n\nPost Order Traversal");
		bst.postOrderTraversal();

		System.out.println("\n\nPrinting tree Graphically");
		bst.printTreeGraphically();

	}
}
