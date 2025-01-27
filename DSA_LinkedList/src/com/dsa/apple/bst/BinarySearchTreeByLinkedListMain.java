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
    }
}
