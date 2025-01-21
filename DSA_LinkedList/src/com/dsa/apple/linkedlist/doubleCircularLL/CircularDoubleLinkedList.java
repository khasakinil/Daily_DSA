package com.dsa.apple.linkedlist.doubleCircularLL;

public class CircularDoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;

    public void createCircularDoubleLinkedList(int nodeValue) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        node.setNext(node);
        node.setPrev(node);
        head = node;
        tail = node;
    }

    public void traverseCircularDoubleLinkedList() {
        if (head != null) {
            System.out.println();
            DoubleNode currentNode = head;
            do {
                System.out.print(currentNode.getValue() + " ");
                currentNode = currentNode.getNext();
            } while (currentNode != head);
        } else {
            System.out.println("Linked List does not exists");
        }
    }

    public void insertInCircularDoubleLinkedList(int location, int nodeValue) {
        if (head != null) {
            DoubleNode node = new DoubleNode();
            node.setValue(nodeValue);
            if (location == 0) {
                node.setNext(head);
                node.setPrev(tail);
                head.setPrev(node);
                tail.setNext(node);
                head = node;
            } else {
                int i = 0;
                DoubleNode tempNode = head;
                DoubleNode currentNode = tempNode;
                do {
                    i++;
                    currentNode = tempNode;
                    tempNode = tempNode.getNext();
                } while (tempNode != head && i < location);

                if (currentNode == head) {
                    tail.setNext(node);
                    node.setPrev(tail);
                    node.setNext(head);
                    tail = node;
                    head.setPrev(node);
                } else {
                    node.setNext(currentNode.getNext());
                    node.getNext().setPrev(node);
                    node.setPrev(currentNode);
                    currentNode.setNext(node);
                }
            }
        } else {
            System.out.println("Linked List does not exists");
        }
    }
}
