package com.dsa.apple.binaryTree;

public class BinaryTreeByLinkedListMain {
    public static void main(String[] args) {
        BinaryTreeByLinkedList binaryTree = new BinaryTreeByLinkedList();
        binaryTree.insertNodeInBinaryTree(10);
        binaryTree.insertNodeInBinaryTree(20);
        binaryTree.insertNodeInBinaryTree(30);
        binaryTree.insertNodeInBinaryTree(40);
        binaryTree.insertNodeInBinaryTree(50);
        binaryTree.insertNodeInBinaryTree(60);
        binaryTree.insertNodeInBinaryTree(70);
        binaryTree.insertNodeInBinaryTree(80);
        binaryTree.insertNodeInBinaryTree(90);
        binaryTree.insertNodeInBinaryTree(100);

        binaryTree.levelOrderTraversal();

        binaryTree.preOrderTraversal();
        binaryTree.inOrderTraversal();
        binaryTree.postOrderTraversal();
        binaryTree.searchNodeInBinaryTree(30);
        binaryTree.searchNodeInBinaryTree(44);
        binaryTree.searchNodeInBinaryTree(55);
        binaryTree.searchNodeInBinaryTree(80);
    }
}
