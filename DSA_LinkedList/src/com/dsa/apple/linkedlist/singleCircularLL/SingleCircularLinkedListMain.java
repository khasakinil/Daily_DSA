package com.dsa.apple.linkedlist.singleCircularLL;

public class SingleCircularLinkedListMain {
    public static void main(String[] args){
        SingleCircularLinkedList scll = new SingleCircularLinkedList();
        scll.createSingleCircularLinkedList(2);
        scll.printSingleCircularLinkedList();
        scll.insertInSingleCircularLinkedList(0, 11);
        scll.insertInSingleCircularLinkedList(0, 22);
        scll.insertInSingleCircularLinkedList(0, 33);
        scll.printSingleCircularLinkedList();
        scll.insertInSingleCircularLinkedList(10, 44);
        scll.printSingleCircularLinkedList();
        scll.insertInSingleCircularLinkedList(10, 55);
        scll.printSingleCircularLinkedList();
        scll.insertInSingleCircularLinkedList(2, 21);
        scll.printSingleCircularLinkedList();
        scll.insertInSingleCircularLinkedList(1, 12);
        scll.printSingleCircularLinkedList();
        scll.deleteFromSingleCircularLinkedList(0);
        scll.printSingleCircularLinkedList();
        scll.deleteFromSingleCircularLinkedList(0);
        scll.printSingleCircularLinkedList();
        scll.deleteFromSingleCircularLinkedList(10);
        scll.printSingleCircularLinkedList();
        scll.deleteFromSingleCircularLinkedList(10);
        scll.printSingleCircularLinkedList();
        scll.deleteFromSingleCircularLinkedList(2);
        scll.printSingleCircularLinkedList();
        scll.deleteEntireCircularLinkedList();
        scll.deleteEntireCircularLinkedList();
    }
}
