package com.dsa.apple.linkedlist.singleLL;

public class SingleNode {
    int value;
    SingleNode next;

    public SingleNode getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "data=" + value +
                ", next=" + next +
                '}';
    }
}
