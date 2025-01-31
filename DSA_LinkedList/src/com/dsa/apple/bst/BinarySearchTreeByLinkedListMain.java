package com.dsa.apple.bst;

public class BinarySearchTreeByLinkedListMain {
    public static void main(String[] args){
        BinarySearchTreeByLinkedList bst = new BinarySearchTreeByLinkedList();
        bst.insert(100);
        bst.insert(80);
        bst.insert(70);
        bst.insert(90);
        bst.insert(50);

        bst.inOrderTraversal();
        bst.preOrderTraversal();
        bst.postOrderTraversal();
        bst.levelOrderTraversal();
        bst.searchNode(70);
        bst.searchNode(80);
        bst.searchNode(50);
        bst.searchNode(10);
        bst.deleteNodeFromBST(50);
        bst.inOrderTraversal();
    }
}
