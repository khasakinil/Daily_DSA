package com.dsa.apple.linkedlist.doubleLL;

public class DoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;

    public void createDoubleLinkedList(int nodeValue) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        node.setPrev(null);
        head = node;
        tail = node;
    }

    public void traverseDoubleLinkedList() {
        if (head != null) {
            System.out.println();
            DoubleNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " ");
                currentNode = currentNode.getNext();
            }
        } else {
            System.out.println("Linked List does not exists");
        }
    }

    public void insertInDoubleLinkedList(int location, int nodeValue) {
        if (head != null) {
            DoubleNode node = new DoubleNode();
            node.setValue(nodeValue);
            if (location == 0) {
                node.setNext(head);
                node.setPrev(null);
                head.setPrev(node);
                head = node;
            } else {
                int i = 0;
                DoubleNode tempNode = head;
                DoubleNode currentNode = tempNode;
                while (tempNode != null && i < location) {
                    i++;
                    currentNode = tempNode;
                    tempNode = tempNode.getNext();
                }

                if (tempNode == null) {
                    currentNode.setNext(node);
                    node.setPrev(currentNode);
                    node.setNext(null);
                    tail = node;
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

    public void searchInDoubleLinkedList(int nodeValue) {
        if (head != null) {
            System.out.println();
            DoubleNode currentNode = head;
            while (currentNode != null) {
                if (currentNode.getValue() == nodeValue) {
                    System.out.println("Node with value : " + nodeValue + " found in Linked List");
                    return;
                }
                currentNode = currentNode.getNext();
            }
            System.out.println("Node with value : " + nodeValue + " not found in Linked List");
        } else {
            System.out.println("Linked List does not exists");
        }
    }

    public void traverseDoubleLinkedListInReverseOrder() {
        if (head != null) {
            DoubleNode currentNode = tail;
            System.out.println();
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " ");
                currentNode = currentNode.getPrev();
            }
        } else {
            System.out.println("Linked List does not exists");
        }
    }

    public void deleteNodeInDoubleLinkedListFromSpecifiedLocation(int location) {
        if (head != null) {
            if (location == 0) {
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    head = head.getNext();
                    head.setPrev(null);
                }
            } else {
                int i = 0;
                DoubleNode tempNode = head;
                DoubleNode currentNode = tempNode;
                while (tempNode != null && i < location) {
                    i++;
                    currentNode = tempNode;
                    tempNode = tempNode.getNext();
                }
                if (tempNode == null) {
                    currentNode = currentNode.getPrev();
                    currentNode.setNext(null);
                    tail = currentNode;
                } else {
                    currentNode.setNext(currentNode.getNext().getNext());
                    currentNode.getNext().setPrev(currentNode);
                }
            }
        } else {
            System.out.println("Linked List does not exists");
        }
    }

    public void deleteEntireDoubleLinkedList() {
        if (head != null) {
            System.out.println();
            DoubleNode currentNode = head;
            while (currentNode != null) {
                currentNode.setPrev(null);
                currentNode = currentNode.getNext();
            }
            head = null;
            tail = null;
            System.out.println("Linked List deleted successfully");
        } else {
            System.out.println("Linked List does not exists");
        }
    }
}
