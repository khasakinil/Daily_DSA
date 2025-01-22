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

                if (tempNode == head) {
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

    public void reverseTraverseCircularDoubleLinkedList() {
        if (head != null) {
            System.out.println();
            DoubleNode currentNode = tail;
            do {
                System.out.print(currentNode.getValue() + " ");
                currentNode = currentNode.getPrev();
            } while (currentNode != tail);
        } else {
            System.out.println("Linked List does not exists");
        }
    }

    public void deletionOfNodeInDoubleCircularLinkedList(int location) {
        if (head != null) {
            if (location == 0) {
                if (head == tail) {
                    head.setNext(null);
                    head.setPrev(null);
                    head = null;
                    tail = null;
                } else {
                    head = head.getNext();
                    head.setPrev(tail);
                    tail.setNext(head);
                }
            } else {
                int i = 0;
                DoubleNode tempNode = head;
                DoubleNode currentNode = tempNode;
                do {
                    i++;
                    currentNode = tempNode;
                    tempNode = tempNode.getNext();
                } while (tempNode != head && i < location);

                if (tempNode == head) {
                    tail = tail.getPrev();
                    tail.setNext(head);
                    head.setPrev(tail);
                } else {
                    currentNode.setNext(currentNode.getNext().getNext());
                    currentNode.getNext().setPrev(currentNode);
                }
            }
        } else {
            System.out.println("Linked List does not exists");
        }
    }

    public void deleteEntireCircularDoubleLinkedList() {
        if (head != null) {
            System.out.println();
            DoubleNode currentNode = head;
            do {
                currentNode.setPrev(null);
                currentNode = currentNode.getNext();
            } while (currentNode != head);

            head.setPrev(null);
            tail.setNext(null);
            head = null;
            tail = null;

            System.out.println("Circular Double Linked List has been deleted successfully");
        } else {
            System.out.println("Linked List does not exists");
        }
    }
}
