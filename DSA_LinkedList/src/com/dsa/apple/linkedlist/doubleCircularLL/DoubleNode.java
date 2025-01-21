package com.dsa.apple.linkedlist.doubleCircularLL;

public class DoubleNode {
    int value;
    DoubleNode next;
    DoubleNode prev;

    public int getValue() {
        return value;
    }

    public DoubleNode getNext() {
        return next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "value=" + value +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}
