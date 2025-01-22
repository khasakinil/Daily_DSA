package com.dsa.apple.linkedlist.doubleCircularLL;

public class CircularDoubleLinkedListMain {
    public static void main(String[] args){
        CircularDoubleLinkedList cdll = new CircularDoubleLinkedList();
        cdll.createCircularDoubleLinkedList(21);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(0, 4);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(0, 3);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(0, 2);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(10, 25);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(10, 35);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(10, 45);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(10, 55);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(10, 65);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(10, 75);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(0, 1);
        cdll.traverseCircularDoubleLinkedList();
        cdll.insertInCircularDoubleLinkedList(2, 22);
        cdll.traverseCircularDoubleLinkedList();

        cdll.reverseTraverseCircularDoubleLinkedList();

        cdll.traverseCircularDoubleLinkedList();
        cdll.deletionOfNodeInDoubleCircularLinkedList(0);
        cdll.traverseCircularDoubleLinkedList();

        cdll.deletionOfNodeInDoubleCircularLinkedList(0);
        cdll.traverseCircularDoubleLinkedList();

        cdll.deletionOfNodeInDoubleCircularLinkedList(30);
        cdll.traverseCircularDoubleLinkedList();
        cdll.deletionOfNodeInDoubleCircularLinkedList(30);
        cdll.traverseCircularDoubleLinkedList();

        cdll.deletionOfNodeInDoubleCircularLinkedList(3);
        cdll.traverseCircularDoubleLinkedList();

        cdll.deletionOfNodeInDoubleCircularLinkedList(4);
        cdll.traverseCircularDoubleLinkedList();

        cdll.deletionOfNodeInDoubleCircularLinkedList(0);
        cdll.traverseCircularDoubleLinkedList();

        cdll.deletionOfNodeInDoubleCircularLinkedList(10);
        cdll.traverseCircularDoubleLinkedList();

        cdll.deleteEntireCircularDoubleLinkedList();
        cdll.deleteEntireCircularDoubleLinkedList();
    }
}
