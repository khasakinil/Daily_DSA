package com.dsa.apple.bst;

public class BinarySearchTreeByLinkedList {
    BinaryNode root;

    public BinarySearchTreeByLinkedList() {
        this.root = null;
    }

    public void insert(int nodeValue) {
        root = insert(root, nodeValue);
    }

    private BinaryNode insert(BinaryNode root, int nodeValue) {
        if (root == null) {
            BinaryNode node = new BinaryNode();
            node.setValue(nodeValue);
            root = node;
        } else {
            if (root.getValue() > nodeValue) {
                root.setLeft(insert(root.getLeft(), nodeValue));
            } else if (root.getValue() < nodeValue) {
                root.setRight(insert(root.getRight(), nodeValue));
            }
        }
        return root;
    }

    public void inOrderTraversal() {
        if (root != null) {
            System.out.println("\nInOrderTraversal : ");
            inOrderTraversal(root);
        } else {
            System.out.println("\nBinarySearchTree does not exists");
        }
    }

    private void inOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        } else {
            inOrderTraversal(root.getLeft());
            System.out.print(root.getValue() + " ");
            inOrderTraversal(root.getRight());
        }
    }
}
