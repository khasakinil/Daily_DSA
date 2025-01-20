package com.dsa.apple.linkedlist.singleLL;

public class SingleLinkedListMain {
    public static void main(String args[]){
        SingleLinkedList sl = new SingleLinkedList();
        sl.createSingleLinkedList(11);
        sl.printSingleLinkedList();
        sl.insertInSingleLinkedList(0, 22);
        sl.printSingleLinkedList();
        sl.insertInSingleLinkedList(0, 33);
        sl.printSingleLinkedList();
        sl.insertInSingleLinkedList(0, 44);
        sl.printSingleLinkedList();
        sl.insertInSingleLinkedList(0, 55);
        sl.printSingleLinkedList();
        sl.insertInSingleLinkedList(10, 66);
        sl.printSingleLinkedList();
        sl.insertInSingleLinkedList(10, 77);
        sl.printSingleLinkedList();
        sl.insertInSingleLinkedList(1, 1);
        sl.printSingleLinkedList();
        sl.insertInSingleLinkedList(2, 2);
        sl.printSingleLinkedList();
        sl.searchNodeInSingleLinkedList(10);
        sl.searchNodeInSingleLinkedList(11);
        sl.deleteNodeAtSpecifiedLocationInSingleLinkedList(0);
        sl.printSingleLinkedList();
        sl.deleteNodeAtSpecifiedLocationInSingleLinkedList(10);
        sl.printSingleLinkedList();
        sl.deleteNodeAtSpecifiedLocationInSingleLinkedList(3);
        sl.printSingleLinkedList();

        sl.deleteNodeAtSpecifiedLocationInSingleLinkedList(1);
        sl.printSingleLinkedList();
        sl.deleteNodeAtSpecifiedLocationInSingleLinkedList(2);
        sl.printSingleLinkedList();

        sl.deleteEntireSingleLinkedList();
        sl.deleteEntireSingleLinkedList();
    }
}
