package com.dsa.tree.binarytree.linkedlist;

public class BinaryTreeByLinkedListMain {
	public static void main(String[] args) {
		BinaryTreeByLinkedList btbll = new BinaryTreeByLinkedList();
		btbll.insertNodeInBinaryTree(14);
		btbll.insertNodeInBinaryTree(24);
		btbll.insertNodeInBinaryTree(34);
		btbll.insertNodeInBinaryTree(44);
		btbll.insertNodeInBinaryTree(54);
		btbll.insertNodeInBinaryTree(64);
		btbll.insertNodeInBinaryTree(74);
		btbll.insertNodeInBinaryTree(84);
		btbll.insertNodeInBinaryTree(94);

		btbll.levelOrderTraversal();
		btbll.preOrderTraversal();
		btbll.InOrderTraversal();
		btbll.postOrderTraversal();

		btbll.searchNodeInBinaryTree(44);
		btbll.searchNodeInBinaryTree(50);

		btbll.deleteNodeFromBinaryTree(64);
		btbll.levelOrderTraversal();

		btbll.deleteNodeFromBinaryTree(24);
		btbll.levelOrderTraversal();
		
		btbll.deleteBinaryTree();
		btbll.levelOrderTraversal();
		btbll.searchNodeInBinaryTree(44);
	}
}
