package com.dsa.apple.linkedlist.doubleLL;

public class DoubleLinkedListMain {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.createDoubleLinkedList(15);
        dll.traverseDoubleLinkedList();

        dll.insertInDoubleLinkedList(0,20);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(0,30);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(0,40);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(0,50);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(10,60);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(10,70);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(10,80);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(10,90);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(1,9);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(2,12);
        dll.traverseDoubleLinkedList();
        dll.insertInDoubleLinkedList(3,13);
        dll.traverseDoubleLinkedList();

        dll.searchInDoubleLinkedList(100);
        dll.searchInDoubleLinkedList(50);
        dll.searchInDoubleLinkedList(13);

        dll.traverseDoubleLinkedListInReverseOrder();

        dll.traverseDoubleLinkedList();
        dll.deleteNodeInDoubleLinkedListFromSpecifiedLocation(0);
        dll.traverseDoubleLinkedList();
        dll.deleteNodeInDoubleLinkedListFromSpecifiedLocation(0);
        dll.traverseDoubleLinkedList();
        dll.deleteNodeInDoubleLinkedListFromSpecifiedLocation(20);
        dll.traverseDoubleLinkedList();
        dll.deleteNodeInDoubleLinkedListFromSpecifiedLocation(20);
        dll.traverseDoubleLinkedList();
        dll.deleteNodeInDoubleLinkedListFromSpecifiedLocation(1);
        dll.traverseDoubleLinkedList();
        dll.deleteNodeInDoubleLinkedListFromSpecifiedLocation(2);
        dll.traverseDoubleLinkedList();

        dll.deleteEntireDoubleLinkedList();
        dll.deleteEntireDoubleLinkedList();
    }
}
