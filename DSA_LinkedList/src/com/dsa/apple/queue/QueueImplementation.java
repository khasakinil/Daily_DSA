package com.dsa.apple.queue;

public class QueueImplementation {
    SingleNode head;
    SingleNode tail;


    public void createQueue(int value) {
        SingleNode node = new SingleNode();
        node.setValue(value);
        node.setNext(null);
        head = node;
        tail = node;
    }

    public void enQueue(int nodeValue) {
        if (head != null) {
            SingleNode node = new SingleNode();
            node.setValue(nodeValue);
            tail.setNext(node);
            tail = node;
        } else {
            System.out.println("Queue does not exists");
        }
    }

    public void printQueue() {
        if (head != null) {
            SingleNode tempNode = head;
            System.out.println();
            while (tempNode != null) {
                System.out.print(tempNode.getValue() + " ");
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("Queue does not exists");
        }
    }

    public void peekQueue() {
        if (head != null) {
            System.out.println("\nPeek() : " + head.getValue());
        } else {
            System.out.println("Queue does not exists");
        }
    }

    public void deQueue() {
        if (head != null) {
            System.out.println("\nDequeue element : " + head.getValue());
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
        } else {
            System.out.println("Queue does not exists");
        }
    }
}
