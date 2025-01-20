package com.dsa.apple.linkedlist.singleLL;

public class SingleLinkedList {
    SingleNode head;
    SingleNode tail;


    public SingleNode createSingleLinkedList(int NodeValue) {
        SingleNode node = new SingleNode();
        node.setValue(NodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        return node;
    }

    public void printSingleLinkedList() {
        if (head != null) {
            SingleNode tempNode = head;
            System.out.println();
            while (tempNode != null) {
                System.out.print(tempNode.getValue() + " ");
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("LinkedList does not exists");
        }
    }

    public void insertInSingleLinkedList(int location, int nodeValue) {
        if (head != null) {
            SingleNode node = new SingleNode();
            node.setValue(nodeValue);

            if (location == 0) {
                node.setNext(head);
                head = node;
            } else {
                SingleNode tempNode = head;
                SingleNode currentNode = head;
                int i = 0;
                while (tempNode != null && i < location) {
                    i++;
                    currentNode = tempNode;
                    tempNode = tempNode.getNext();
                }
                if (tempNode == null) {
                    currentNode.setNext(node);
                    tail = node;
                } else {
                    node.setNext(tempNode.getNext());
                    tempNode.setNext(node);
                }
            }

        } else {
            System.out.println("LinkedList does not exists");
        }
    }

    public void searchNodeInSingleLinkedList(int nodeValue) {
        if (head != null) {
            SingleNode tempNode = head;
            System.out.println();
            while (tempNode != null) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node with value - " + nodeValue + " present in linked list");
                    return;
                }
                tempNode = tempNode.getNext();
            }
            System.out.println("Node with value - " + nodeValue + " not present in linked list");
        } else {
            System.out.println("LinkedList does not exists");
        }
    }

    public void deleteNodeAtSpecifiedLocationInSingleLinkedList(int location) {
        if (head != null) {
            if (location == 0) {
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    head = head.getNext();
                }
            } else {
                int i = 0;
                SingleNode tempnode = head;
                SingleNode currentNode = tempnode;
                while (tempnode.getNext() != null && i < location) {
                    i++;
                    currentNode = tempnode;
                    if (tempnode.getNext().getNext() == null) {
                        tempnode.setNext(null);
                        return;
                    }
                    tempnode = tempnode.getNext();
                }
                currentNode.setNext(currentNode.getNext().getNext());
            }
        } else {
            System.out.println("LinkedList does not exists");
        }
    }

    public void deleteEntireSingleLinkedList() {
        System.out.println();
        if (head != null) {
            head = null;
            tail = null;
            System.out.println("LinkedList deleted successfully");
        } else {
            System.out.println("LinkedList does not exists");
        }
    }
}
