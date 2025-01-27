package com.dsa.apple.bst;

public class BinaryNode {
    int value;
    BinaryNode right;
    BinaryNode left;

    public int getValue() {
        return value;
    }

    public BinaryNode getRight() {
        return right;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "value=" + value +
                '}';
    }
}
